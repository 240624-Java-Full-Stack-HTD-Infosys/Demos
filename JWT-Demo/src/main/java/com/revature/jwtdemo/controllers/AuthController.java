package com.revature.jwtdemo.controllers;

import com.revature.jwtdemo.dtos.AuthDto;
import com.revature.jwtdemo.exceptions.AuthException;
import com.revature.jwtdemo.services.JwtTokenService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * This controller exposes an authenticate endpoint which can be used to
 * log in. This will generate and return the bearer token cookie which
 * is necessary to reach any endpoint in SecureController
 */
@RestController
public class AuthController {
    private final Environment environment;
    private final JwtTokenService tokenService;

    @Autowired
    public AuthController(JwtTokenService tokenService, Environment environment) {
        this.environment = environment;
        this.tokenService = tokenService;
    }

    @PostMapping("/authenticate")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody AuthDto authDto, HttpServletResponse response) {
        String username = environment.getProperty("AUTH_USERNAME");
        String password = environment.getProperty("AUTH_PASSWORD");

        if(authDto.getUsername().equals(username)
        && authDto.getPassword().equals(password)) {
            Map<String, String> claimsMap = new HashMap<>();
            claimsMap.put("username", username);
            claimsMap.put("role", "admin");
            Cookie cookie = new Cookie("Authentication", this.tokenService.generateToken(claimsMap));
            response.addCookie(cookie);
        } else {
            throw new AuthException("Bad username or password.");
        }
        return "Authenticated.";
    }

    @ExceptionHandler(AuthException.class)
    public String authExceptionHandler(AuthException e) {
        return "Bad username or password.";
    }
}

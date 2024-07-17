package com.revature.jwtdemo.controllers;

import com.revature.jwtdemo.dtos.AuthDto;
import com.revature.jwtdemo.exceptions.AuthenticationException;
import com.revature.jwtdemo.services.JwtTokenService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ClaimsBuilder;
import io.jsonwebtoken.Jws;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public void generateCookie(@RequestBody AuthDto authDto, HttpServletResponse response) {
        String username = environment.getProperty("username");
        String password = environment.getProperty("password");

        if(username.equals(authDto.getUsername())
        && password.equals(authDto.getPassword())) {
            Map<String, String> claimsMap = new HashMap<>();
            claimsMap.put("username", username);
            claimsMap.put("role", "admin");
            Cookie cookie = new Cookie("Authentication", this.tokenService.generateToken(claimsMap));
            response.addCookie(cookie);
        } else {
            throw new AuthenticationException("Bad username or password.");
        }
    }

    @GetMapping("/auth")
    public List<String> parseCookie(@CookieValue("Authentication") String auth) {
        Jws<Claims> claims = tokenService.parseToken(auth);
        Map<String, Object> map = claims.getPayload();
        List<String> strings = new ArrayList<>();
        for(String key : map.keySet()) {
            strings.add((String)map.get(key));
        }
        //String test = claims.getPayload().get("testKey1", String.class);

        return strings;
    }
}

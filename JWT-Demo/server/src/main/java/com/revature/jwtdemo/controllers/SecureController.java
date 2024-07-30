package com.revature.jwtdemo.controllers;

import com.revature.jwtdemo.exceptions.AuthException;
import com.revature.jwtdemo.services.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * This controller exposes endpoints which are only valid for
 * requests which contain the bearer token. We will parse and verify
 * the token in every method.
 */
@RestController
public class SecureController {
    JwtTokenService tokenService;
    Environment env;

    @Autowired
    public SecureController(JwtTokenService tokenService, Environment env) {
        this.tokenService = tokenService;
        this.env = env;
    }

    @GetMapping("/secret")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(
            origins = {"http://localhost:4200"},
            allowCredentials = "true"
    )
    public String getSecretWord(@CookieValue("Authentication") String bearerToken) {
        if(tokenService.validateAuthentication(bearerToken)) {
            return env.getProperty("SECRET_WORD");
        }
        throw new AuthException("User not authorized");
    }
}

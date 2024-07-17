package com.revature.jwtdemo.controllers;

import com.revature.jwtdemo.services.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller exposes endpoints which are only valid for
 * requests which contain the bearer token. We will parse and verify
 * the token in every method.
 */
@RestController
public class SecureController {
    JwtTokenService tokenService;

    @Autowired
    public SecureController(JwtTokenService tokenService) {
        this.tokenService = tokenService;
    }

    @GetMapping("/secret")
    @ResponseStatus(HttpStatus.OK)
    public String getSecretWord(@CookieValue("Authentication") String bearerToken) {

    }
}

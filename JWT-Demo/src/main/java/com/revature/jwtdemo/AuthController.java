package com.revature.jwtdemo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AuthController {
    JwtTokenService tokenService;

    @Autowired
    public AuthController(JwtTokenService tokenService) {
        this.tokenService = tokenService;
    }


    @PostMapping("/auth")
    public void generateCookie(HttpServletResponse response) {
        Map<String, String> claims = new HashMap<>();
        claims.put("testKey1", "testVal1");
        claims.put("testKey2", "testVal2");

        Cookie cookie = new Cookie("Authentication", this.tokenService.generateToken(claims));
        response.addCookie(cookie);
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

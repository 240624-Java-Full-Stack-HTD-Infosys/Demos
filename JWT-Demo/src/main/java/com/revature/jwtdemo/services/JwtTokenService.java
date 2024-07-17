package com.revature.jwtdemo.services;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@Service
public class JwtTokenService {
    private final Environment environment;
    private final SecretKey decodedKey;

    @Autowired//autowiring an environment bean, a way to access a .properties file in Spring
    public JwtTokenService(Environment environment) {
        this.environment = environment;//this thing will contain properties from application.properties
        String encodedKey = this.environment.getProperty("jwt-secret-key");
        this.decodedKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(encodedKey));
    }


    public String generateToken(Map<String, String> claims) {
        JwtBuilder builder = Jwts.builder()
                .issuer("revature")
                .subject("authentication")
                .issuedAt(Date.from(Instant.now()))
                .expiration(Date.from(Instant.now().plus(Duration.ofDays(7))));

        Set<String> claimKeys = claims.keySet();
        for(String claimKey : claimKeys) {
            builder.claim(claimKey, claims.get(claimKey));
        }

        return URLEncoder.encode("Bearer " + builder.signWith(decodedKey).compact(), StandardCharsets.UTF_8);
    }

    public Jws<Claims> parseToken(String bearerToken) {

        String token = bearerToken.substring(7);//remove the "Bearer " prefix

        return Jwts.parser()
                .verifyWith(decodedKey)
                .build()
                .parseSignedClaims(token);
    }

    public boolean validateAuthentication(String bearerToken) {
        Jws<Claims> claims = this.parseToken(bearerToken);
        return claims.getPayload().get("username").equals(environment.getProperty("username"));

    }

}

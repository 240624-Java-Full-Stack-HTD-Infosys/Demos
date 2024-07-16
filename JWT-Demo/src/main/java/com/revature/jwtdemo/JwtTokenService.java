package com.revature.jwtdemo;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@Service
public class JwtTokenService {
    private Environment environment;

    @Autowired
    public JwtTokenService(Environment environment) {//autowiring an environment bean
        this.environment = environment;
    }


    public String generateToken(Map<String, String> claims) {
        String key = environment.getProperty("jwt-secret-key");
        Key decodedKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(key));

        JwtBuilder builder = Jwts.builder()
                .issuer("revature")
                .subject("authentication")
                .issuedAt(Date.from(Instant.now()))
                .expiration(Date.from(Instant.now().plus(Duration.ofDays(7))));

        Set<String> claimKeys = claims.keySet();
        for(String claimKey : claimKeys) {
            builder.claim(claimKey, claims.get(claimKey));
        }

        //        return /*"Bearer " + */ builder.signWith(decodedKey, SignatureAlgorithm.HS256).compact();
        return URLEncoder.encode("Bearer " + builder.signWith(decodedKey).compact(), StandardCharsets.UTF_8);
    }

    public Jws<Claims> parseToken(String bearerToken) {
        String key = environment.getProperty("jwt-secret-key");
        SecretKey decodedKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(key));

        String token = bearerToken.substring(7);
//        System.out.println(bearerToken);
//        System.out.println(token);

        return Jwts.parser()
                .verifyWith(decodedKey)
                .build()
                .parseSignedClaims(token);
    }

}

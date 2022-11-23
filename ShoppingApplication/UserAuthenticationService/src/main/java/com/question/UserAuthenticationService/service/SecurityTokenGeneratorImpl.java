package com.question.UserAuthenticationService.service;

import com.question.UserAuthenticationService.domain.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class SecurityTokenGeneratorImpl implements SecurityTokenGenerator{
    @Override
    public Map<String, String> generateToken(User user) {
        String jwToken = null;
        jwToken = Jwts.builder()
                .setSubject(user.getUserId())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"mykey").compact();
        Map<String, String> map = new HashMap<>();
        map.put("token",jwToken);
        map.put("message","User logged in!!");
        return map;
    }
}

package com.question.UserAuthenticationService.service;

import com.question.UserAuthenticationService.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String,String> generateToken(User user);
}

package com.question.UserAuthenticationService.service;

import com.question.UserAuthenticationService.domain.User;
import com.question.UserAuthenticationService.exception.UserAlreadyExistsException;
import com.question.UserAuthenticationService.exception.UserNotFoundException;

public interface UserService {
    User addUser(User user) throws UserAlreadyExistsException;
    User findByUserIdAndPassword(String userId,String password) throws UserNotFoundException;
}

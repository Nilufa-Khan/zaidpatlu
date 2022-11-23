package com.question.UserAuthenticationService.service;

import com.question.UserAuthenticationService.domain.User;
import com.question.UserAuthenticationService.exception.UserAlreadyExistsException;
import com.question.UserAuthenticationService.exception.UserNotFoundException;
import com.question.UserAuthenticationService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) throws UserAlreadyExistsException {
        if(userRepository.findById(user.getUserId()).isPresent()){
            throw new UserAlreadyExistsException();
        }
        return userRepository.save(user);
    }

    @Override
    public User findByUserIdAndPassword(String userId, String password) throws UserNotFoundException {
        User user = userRepository.findByUserIdAndPassword(userId,password);
        if(user == null){
            throw new UserNotFoundException();
        }
        return user;
    }
}

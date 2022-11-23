package com.question.UserProductService.service;

import com.question.UserProductService.domain.Product;
import com.question.UserProductService.domain.User;
import com.question.UserProductService.exception.ProductNotFoundException;
import com.question.UserProductService.exception.UserAlreadyExistsException;
import com.question.UserProductService.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    User addUser(User user) throws UserAlreadyExistsException;
    User addProductForUser(String userId, Product product) throws UserNotFoundException;
    User deleteProductForUser(String userId,int productId) throws ProductNotFoundException, UserNotFoundException;
    List<Product> getProductForUser(String userId) throws UserNotFoundException;
}

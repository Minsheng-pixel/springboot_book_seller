package com.sha.springbootbooksellermaven.service;

import com.sha.springbootbooksellermaven.model.User;

import java.util.Optional;

public interface IUserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}

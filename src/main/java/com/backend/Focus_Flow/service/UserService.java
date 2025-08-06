package com.backend.Focus_Flow.service;

import com.backend.Focus_Flow.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUser(Long id);
    User updateUser(Long id, User user);
    void removeUser(Long id);
}

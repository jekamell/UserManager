package com.soft.usermanager.service;

import com.soft.usermanager.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getByLogin(String login);
    User getById(Long id);
    void add(User user);
    void update(User user);
}

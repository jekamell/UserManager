package com.soft.usermanager.model.dao;

import com.soft.usermanager.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    List getByLoginOrPhone(String param);
    User getByLogin(String login);
    User getById(Long id);
    void add(User user);
    void update(User user);
}

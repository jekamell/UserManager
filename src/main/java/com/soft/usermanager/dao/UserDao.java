package com.soft.usermanager.dao;

import com.soft.usermanager.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
}

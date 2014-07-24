package com.soft.usermanager.services;

import com.soft.usermanager.dao.HibernateUserDao;
import com.soft.usermanager.dao.UserDao;
import com.soft.usermanager.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new HibernateUserDao();

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}

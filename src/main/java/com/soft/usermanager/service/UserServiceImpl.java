package com.soft.usermanager.service;

import com.soft.usermanager.dao.HibernateUserDao;
import com.soft.usermanager.dao.UserDao;
import com.soft.usermanager.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new HibernateUserDao();

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }
}

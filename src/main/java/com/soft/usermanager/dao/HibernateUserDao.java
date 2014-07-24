package com.soft.usermanager.dao;

import com.soft.usermanager.model.User;

import java.util.List;

public class HibernateUserDao extends DaoBase implements UserDao {
    @Override
    public List<User> getAll() {
        return (List<User>)getSession().createQuery("from User").list();
    }
}

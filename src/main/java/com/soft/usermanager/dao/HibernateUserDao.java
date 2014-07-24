package com.soft.usermanager.dao;

import com.soft.usermanager.model.User;

import java.util.List;

public class HibernateUserDao extends DaoBase implements UserDao {
    @Override
    public List<User> getAll() {
        return (List<User>)getSession().createQuery("from User").list();
    }

    @Override
    public User getByLogin(String login) {
        List list = getSession().createQuery("from User where login=:login").setParameter("login", login).list();
        if (list.isEmpty()) {
            return null;
        }
        return (User) list.get(0);
    }
}

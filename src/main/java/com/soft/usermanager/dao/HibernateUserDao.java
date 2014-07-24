package com.soft.usermanager.dao;

import com.soft.usermanager.model.User;
import org.hibernate.Session;

import java.util.List;

public class HibernateUserDao extends DaoBase implements UserDao {
    @Override
    public List<User> getAll() {
        Session session = getSession();

        return (List<User>)session.createQuery("from User").list();
    }
}

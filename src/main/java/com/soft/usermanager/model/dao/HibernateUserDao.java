package com.soft.usermanager.model.dao;

import com.soft.usermanager.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateUserDao extends DaoBase implements UserDao {
    @Override
    public List<User> getAll() {
        return (List<User>)getSession().createQuery("from User where isEnabled=true").list();
    }

    @Override
    public User getByLogin(String login) {
        List list = getSession().createQuery("from User where login=:login").setParameter("login", login).list();
        if (list.isEmpty()) {
            return null;
        }
        return (User) list.get(0);
    }

    @Override
    public void add(User user) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();

        session.save(user);

        tx.commit();
    }

    @Override
    public User getById(Long id) {
        List list = getSession().createQuery("from User where id=:id").setParameter("id", id).list();
        if (list.isEmpty()) {
            return null;
        }
        return (User) list.get(0);
    }

    @Override
    public void update(User user) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();

        session.merge(user);

        tx.commit();
    }

    @Override
    public List<User> getByLoginOrPhone(String param) {
        return (List<User>)getSession()
            .createQuery("From User where login like :query OR str(phoneNumber) like :query")
            .setParameter("query", "%" + param + "%").list();
    }
}

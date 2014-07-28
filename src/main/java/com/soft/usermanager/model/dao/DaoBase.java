package com.soft.usermanager.model.dao;

import com.soft.usermanager.listener.HibernateListener;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class DaoBase {

    protected Session getSession() {
        SessionFactory factory = (SessionFactory) ServletActionContext.getServletContext()
                .getAttribute(HibernateListener.KEY_NAME);

        return factory.openSession();
    }
}

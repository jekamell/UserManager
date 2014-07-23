package com.soft.usermanager.listener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener {

    private Configuration config;
    private SessionFactory factory;
    private String path = "/hibernate.cfg.xml";
    private static Class clazz = HibernateListener.class;

    public static final String KEY_NAME = clazz.getName();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            URL url = HibernateListener.class.getResource(path);
            config = new Configuration().configure(url);
            factory = config.buildSessionFactory();
            sce.getServletContext().setAttribute(KEY_NAME, factory);
        } catch (Exception ignored) {}
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

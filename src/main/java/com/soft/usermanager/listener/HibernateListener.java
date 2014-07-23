package com.soft.usermanager.listener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener {

    private Configuration config;
    private SessionFactory sessionFactory;
    private String path = "/resources/hibernate.cfg.xml";

    public static final String KEY_NAME = HibernateListener.class.getName();

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        if ( sessionFactory != null ) {
            sessionFactory.close();
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            URL url = HibernateListener.class.getResource("/com/soft/");
            System.out.println("URL " + url);
            config = new AnnotationConfiguration().configure(url);
            sessionFactory = config.buildSessionFactory();
            event.getServletContext().setAttribute(KEY_NAME, sessionFactory);
        } catch (Exception e) {
            System.out.println("!!!");
            System.out.println(e.getMessage());
        }
    }
}

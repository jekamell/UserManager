package com.soft.usermanager.listener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import java.net.URL;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener {

    private Configuration config;
    private SessionFactory sessionFactory;
    private String path = "/com/soft/usermanager/hibernate.cfg.xml";

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
            URL url = HibernateListener.class.getResource(path);
            config = new AnnotationConfiguration().configure(url);
            sessionFactory = config.buildSessionFactory();
            event.getServletContext().setAttribute(KEY_NAME, sessionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

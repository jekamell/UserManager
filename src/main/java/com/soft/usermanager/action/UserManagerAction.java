package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.soft.usermanager.helper.HibernateUtil;
import com.soft.usermanager.listener.HibernateListener;
import com.soft.usermanager.model.User;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class UserManagerAction extends ActionSupport implements ModelDriven {
    User user = new User();
    List users = new ArrayList<User>();
    Session session;

    public String getList() {

        return "success";
    }

    public String getAddForm() {

        return "success";
    }

    @Override
    public Object getModel() {
        return user;
    }

    public String listUsers() throws Exception {
        SessionFactory factory = (SessionFactory) ServletActionContext.getServletContext()
            .getAttribute(HibernateListener.KEY_NAME);
//
        Session session = factory.openSession();
        users = (List<User>)session.createQuery("from User").list();
//
        return SUCCESS;
    }
}

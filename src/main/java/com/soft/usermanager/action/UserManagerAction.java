package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.soft.usermanager.listener.HibernateListener;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class UserManagerAction extends ActionSupport implements ModelDriven {
    User user = new User();
    List users = new ArrayList<User>();
    UserService userService = new UserServiceImpl();

    public String getAddForm() {

        return "success";
    }

    @Override
    public Object getModel() {
        return user;
    }

    public String listUsers() throws Exception {
        users = userService.getAll();

        return SUCCESS;
    }

    public List getUsers() {
        return users;
    }

    public void setUsers(List users) {
        this.users = users;
    }
}

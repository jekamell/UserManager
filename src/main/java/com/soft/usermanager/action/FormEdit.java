package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

public class FormEdit extends ActionSupport {
    private String id;
    private User user;
    private UserService userService = new UserServiceImpl();

    @Override
    public String execute() throws Exception {
        if (getId() == null) {
            return INPUT;
        }
        user = userService.getById(Long.parseLong(getId()));

        return SUCCESS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

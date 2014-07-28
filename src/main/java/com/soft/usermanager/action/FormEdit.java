package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

public class FormEdit extends ControllerBase{
    private String id;
    private User user;

    public String execute() {
        if (getId() == null) {
            return ActionSupport.INPUT;
        }
        user = userService.getById(Long.parseLong(getId()));

        return ActionSupport.SUCCESS;
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

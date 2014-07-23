package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.soft.usermanager.model.User;

public class RegisterAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    public User getModel() {
        return user;
    }

    public String execute() {
        return SUCCESS;
    }

    public void validate() {
        if(user.getLogin() == null || user.getLogin().length() == 0) {
            addFieldError("username","Username is required");
        }
    }
}

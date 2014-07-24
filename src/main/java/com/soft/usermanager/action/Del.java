package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

public class Del extends ActionSupport {
    private String id;
    private UserService userService = new UserServiceImpl();

    @Override
    public String execute() throws Exception {
        if (getId() == null) {
            return INPUT;
        }

        User current = userService.getById(Long.parseLong(getId()));
        if (current == null) {
            return INPUT;
        }

        current.setIsEnabled(false);
        userService.update(current);

        return SUCCESS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

public class Del extends ControllerBase {
    private String id;

    public String execute() throws Exception {
        if (getId() == null) {
            return ActionSupport.INPUT;
        }

        User current = userService.getById(Long.parseLong(getId()));
        if (current == null) {
            return ActionSupport.INPUT;
        }

        current.setIsEnabled(false);
        userService.update(current);

        return ActionSupport.SUCCESS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

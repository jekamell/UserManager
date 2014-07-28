package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

public class Update extends ControllerBase {
    private User user;

    public String execute() {
        User current = userService.getById(user.getId());
        if (current == null) {
            return ActionSupport.INPUT;
        }

        current.setNameFirst(user.getNameFirst());
        current.setNameLast(user.getNameLast());
        current.setEmail(user.getEmail());
        current.setPhoneNumber(user.getPhoneNumber());

        userService.update(user);

        return ActionSupport.SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

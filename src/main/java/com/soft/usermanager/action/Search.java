package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

import java.util.List;

public class Search extends ActionSupport {
    private String query;
    private List<User> users;
    private UserService userService = new UserServiceImpl();

    @Override
    public String execute() throws Exception {
        if (getQuery() == null || getQuery().length() == 0) {
            users = userService.getAll();
        } else {
            users = userService.getByLoginOrPhone(getQuery());
        }

        return SUCCESS;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

package com.soft.usermanager.action;

import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

public abstract class ControllerBase {
    protected UserService userService = new UserServiceImpl();
}

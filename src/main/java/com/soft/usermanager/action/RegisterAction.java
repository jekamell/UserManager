package com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.usermanager.model.User;
import com.soft.usermanager.service.UserService;
import com.soft.usermanager.service.UserServiceImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterAction extends ActionSupport {
    private User user = new User();
    private UserService userService = new UserServiceImpl();

    public String execute() {
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void validate() {
        //login::required
        if (user.getLogin() == null || user.getLogin().length() == 0) {
            addFieldError("user.login", getRequiredAttributeErrorMessage("Login"));
        }
        //password::required
        if (user.getPassword() == null || user.getPassword().length() == 0) {
            addFieldError("user.password", getRequiredAttributeErrorMessage("Password") );
        }
        //passwordRepeat::required
        if (user.getPasswordRepeat() == null || user.getPasswordRepeat().length() == 0) {
            addFieldError("user.passwordRepeat", getRequiredAttributeErrorMessage("Password repeat") );
        }
        //password&passwordRepeat::equal
        if (user.getPassword() != null && !user.getPassword().equals(user.getPasswordRepeat())) {
            addFieldError("user.password", "The passwords don't match");
            addFieldError("user.passwordRepeat", "The passwords don't match");
        }
        //email::regex
        if (user.getEmail() != null && user.getEmail().length() > 0) {
            final String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            Pattern pattern = Pattern.compile(emailPattern);
            Matcher matcher = pattern.matcher(user.getEmail());

            if (!matcher.matches()) {
                addFieldError("user.email", "Wrong E-mail format");
            }
        }

        //login::unique
        if (!isLoginUnique(user.getLogin())) {
            addFieldError("user.login", "Username already exists");
        }
    }

    private boolean isLoginUnique(String login) {
        return userService.getByLogin(login) == null;
    }

    private String getRequiredAttributeErrorMessage(String attribute) {
        return attribute + " is required";
    }
}

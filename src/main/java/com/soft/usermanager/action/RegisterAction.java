package main.java.com.soft.usermanager.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import main.java.com.soft.usermanager.model.User;

public class RegisterAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    public User getModel() {
        return user;
    }

    public String execute() {
        if (user.addUser()) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public void validate() {
        if(user.getLogin() == null || user.getLogin().length() == 0) {
            addFieldError("username","Username is required");
        }
    }
}

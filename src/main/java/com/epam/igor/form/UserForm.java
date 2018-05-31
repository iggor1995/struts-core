package com.epam.igor.form;

import com.epam.igor.model.User;
import org.apache.struts.action.ActionForm;

import java.util.List;

public class UserForm extends ActionForm {

    private List<User> users;
    private User user;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

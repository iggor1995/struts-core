package com.epam.igor.action;

import com.epam.igor.form.LoginForm;
import com.epam.igor.model.User;
import com.epam.igor.service.UserService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    private static final String REGISTERED_USER = "registeredUser";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
        LoginForm loginForm = (LoginForm) form;
        UserService userService = new UserService();

        User user = userService.getUserByEmail(loginForm.getEmail());

        if (user != null && user.getPassword().equals(loginForm.getPassword())) {
            request.setAttribute(REGISTERED_USER, user);
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }
    }
}
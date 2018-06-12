package com.epam.igor.action;

import com.epam.igor.form.LoginForm;
import com.epam.igor.form.RegisterForm;
import com.epam.igor.model.Role;
import com.epam.igor.model.User;
import com.epam.igor.service.ServiceException;
import com.epam.igor.service.UserService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterUserAction extends Action {
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ServiceException {

        RegisterForm registerForm = (RegisterForm) form;
        UserService userService = new UserService();

        User user = new User();
        user.setName(registerForm.getName());
        user.setBirthday(registerForm.getBirthday());
        user.setPassword(registerForm.getPassword());
        user.setEmail(registerForm.getEmail());
        user.setRole(Role.ROLE_REGISTERED_USER);

        User newUser = userService.registerUser(user);

        return mapping.findForward(SUCCESS);
    }
}
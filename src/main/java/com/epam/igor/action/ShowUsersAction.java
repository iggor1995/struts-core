package com.epam.igor.action;

import com.epam.igor.form.UserForm;
import com.epam.igor.model.User;
import com.epam.igor.service.ServiceException;
import com.epam.igor.service.UserService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ShowUsersAction extends Action {
    private static final String SUCCESS = "success";

    private static final String ID = "id";
    /**
     * Method takes all {@link User} and sends it to page for displaying
     *
     * @param mapping  of struts
     * @param form     going to page for displaying
     * @param request  going on view
     * @param response going on view
     * @return ActionForward object that contain mapping on forward page
     */
    public ActionForward view(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ActionException {
        takeUsers((UserForm) form);
        return mapping.findForward("view");
    }
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ActionException {
        UserForm userForm = (UserForm) form;
        UserService service = new UserService();
        List<User> users = service.getAllUsers();
        userForm.setUsers(users);
        return mapping.findForward(SUCCESS);
    }
    private void takeUsers(UserForm form) throws ActionException {
        UserService service = new UserService();
        List<User> users = service.getAllUsers();
        form.setUsers(users);
    }
}

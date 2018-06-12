package com.epam.igor.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class LoginForm extends ActionForm {

    private String email;

    private String password;


    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (email == null || email.length() < 1) {
            errors.add("email", new ActionMessage("error.email.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (password == null || password.length() < 1) {
            errors.add("password", new ActionMessage("error.password.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        System.out.println("Inside getter "+email);
        return email;
    }

    /**
     * @param email the userName to set
     */
    public void setEmail(String email) {
        System.out.println("Inside setter "+email);
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

package com.epam.igor.action;

import com.epam.igor.form.EventForm;
import com.epam.igor.form.UserForm;
import com.epam.igor.model.Event;
import com.epam.igor.model.User;
import com.epam.igor.service.EventService;
import com.epam.igor.service.UserService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ShowEventsAction extends Action {
    private static final String SUCCESS = "success";

    private static final String ID = "id";
    /**
     * Method takes all {@link com.epam.igor.model.Event} and sends it to page for displaying
     * @param mapping  of struts
     * @param form     going to page for displaying
     * @param request  going on view
     * @param response going on view
     * @return ActionForward object that contain mapping on forward page
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ActionException {
        EventForm eventForm = (EventForm) form;
        EventService service = new EventService();
        List<Event> events = service.getAllEvents();
        eventForm.setUsers(events);
        return mapping.findForward(SUCCESS);
    }
}

package com.epam.igor.action;

import com.epam.igor.form.EventForm;
import com.epam.igor.model.Event;
import com.epam.igor.service.EventService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ShowHomePageAction extends Action {
    private static final String SUCCESS = "success";

    private static final String ID = "id";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws ActionException {

        EventForm eventForm = (EventForm) form;
        EventService eventService = new EventService();
        List<Event> events = eventService.getAllEvents();
        System.out.println(events + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + eventForm);
        eventForm.setEvents(events);
        return mapping.findForward(SUCCESS);
    }
}
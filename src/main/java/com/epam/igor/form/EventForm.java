package com.epam.igor.form;

import com.epam.igor.model.Event;
import org.apache.struts.action.ActionForm;

import java.util.List;

public class EventForm extends ActionForm {

    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public void setUsers(List<Event> events) {
        this.events = events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}

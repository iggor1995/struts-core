package com.epam.igor.service;

import com.epam.igor.dao.EventDao;
import com.epam.igor.model.Event;

import java.util.List;

public class EventService {

    public List<Event> getAllEvents() {
        EventDao eventDao = new EventDao();
        return eventDao.getAll();
    }
}

package com.epam.igor.dao;

import com.epam.igor.model.Event;

import javax.persistence.Query;
import java.util.List;

public class EventDao extends AbstractDao implements Dao<Event> {

    @Override
    public Event findById(int id) throws DaoException {
        rebootManager();
        Event event = entityManager.find(Event.class, id);
        if (event == null) {
            throw new DaoException("Do not find any events");
        }
        return event;
    }

    @Override
    public Event update(Event entity) throws DaoException {
        return null;
    }

    @Override
    public void delete(int id) throws DaoException {

    }

    public List<Event> getAll(){
        rebootManager();
        Query query = entityManager.createQuery("FROM Event ", Event.class);
        return query.getResultList();
    }
}
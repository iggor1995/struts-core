package com.epam.igor.dao;

import com.epam.igor.model.User;

public class UserDao extends AbstractDao implements Dao<User> {

    @Override
    public User findById(int id) throws DaoException {
        rebootManager();
        User user = entityManager.find(User.class, id);
        if (user == null) {
            throw new DaoException("Do not find any users");
        }
        return user;
    }

    @Override
    public User update(User entity) throws DaoException {
        return null;
    }

    @Override
    public void delete(int id) throws DaoException {

    }
}

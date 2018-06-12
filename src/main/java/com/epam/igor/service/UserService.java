package com.epam.igor.service;

import com.epam.igor.dao.DaoException;
import com.epam.igor.dao.UserDao;
import com.epam.igor.model.User;

import java.util.List;

public class UserService {

//    public void registerUser(User user) throws ServiceException {
//        UserDao userDao = new UserDao();
//        try {
//            userDao.save(user);
//        } catch (DaoException e) {
//            throw new ServiceException("Couldn't store user to db", e);
//        }
//
//    }

    public List<User> getAllUsers(){
        UserDao userDao = new UserDao();
        return userDao.getAll();
    }

    public User getUserByEmail(String email) {
        UserDao userDao = new UserDao();
        return userDao.getUserByEmail(email);
    }

    public User registerUser(User user) throws ServiceException {
        try {
            UserDao userDao = new UserDao();
            return userDao.update(user);
        } catch (DaoException e) {
            throw new ServiceException("couldn't save user", e);
        }
    }
}

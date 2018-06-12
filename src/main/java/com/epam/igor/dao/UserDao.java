package com.epam.igor.dao;

import com.epam.igor.model.User;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

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
    public User update(User user) throws DaoException {
        rebootManager();
        entityManager.getTransaction().begin();
        User newUser = entityManager.merge(user);
        entityManager.getTransaction().commit();
        return newUser;
    }

    @Override
    public void delete(int id) throws DaoException {}

    public List<User> getAll(){
        rebootManager();
        Query query = entityManager.createQuery("FROM User ", User.class);
        return query.getResultList();
    }

    public User getUserByEmail(String email) {
        rebootManager();
        try {
            User user = entityManager.createQuery(
                    "SELECT u from User u WHERE u.email = :email", User.class).
                    setParameter("email", email).getSingleResult();
            return user;
        } catch (NoResultException nre){
            return null;
        }
    }

}

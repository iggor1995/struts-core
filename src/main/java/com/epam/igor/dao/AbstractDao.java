package com.epam.igor.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class AbstractDao {

    protected static final String UNIT_NAME = "strutscore";

    protected EntityManager entityManager;

    protected void rebootManager() {
        entityManager = Persistence.createEntityManagerFactory(UNIT_NAME).createEntityManager();
    }

}

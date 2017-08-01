package com.jrsoft.poc.mongodb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MessaggeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Message create(Message person) {
        entityManager.persist( person );
        return person;
    }
}

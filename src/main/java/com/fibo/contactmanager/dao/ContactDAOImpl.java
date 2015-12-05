package com.fibo.contactmanager.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.fibo.contactmanager.domain.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {
    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this. entityManager = entityManager;
    }


    public void addContact(Contact contact) {
        EntityManager manager = getEntityManager();
        manager.persist(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {
        EntityManager manager = getEntityManager();
        Query query = manager.createQuery("from Contact");
        List<Contact> list = query.getResultList();
        return list;
    }

    public void removeContact(Integer id) {
        EntityManager manager = getEntityManager();
        Contact contact = manager.getReference(Contact.class, id);
        manager.remove(contact);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}

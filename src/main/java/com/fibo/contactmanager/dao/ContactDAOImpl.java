package com.fibo.contactmanager.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.fibo.contactmanager.domain.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {
    private static EntityManagerFactory managerFactory;
    //	@Autowired
//	private SessionFactory sessionFactory;
    //@PersistenceContext(unitName = "contact", type = PersistenceContextType
 //           .EXTENDED)
    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this. entityManager = entityManager;
    }


    public void addContact(Contact contact) {
        EntityManager manager = getEntityManager();
//        EntityTransaction tran = manager.getTransaction();
//        tran.begin();
        manager.persist(contact);
//        tran.commit();
//        manager.close();
        ///	sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {
        EntityManager manager = getEntityManager();
//        EntityTransaction tran = manager.getTransaction();
//        tran.begin();
        Query query = manager.createQuery("from Contact");
        List<Contact> list = query.getResultList();
//        tran.commit();
//        manager.close();
        return list;
//		return sessionFactory.getCurrentSession().createQuery("from Contact")
//			.list();
    }

    public void removeContact(Integer id) {
//		Contact contact = (Contact) sessionFactory.getCurrentSession().load(
//				Contact.class, id);
//		if (null != contact) {
//			sessionFactory.getCurrentSession().delete(contact);
//		}

    }

    public EntityManager getEntityManager() {
//        if (managerFactory == null) {
//            managerFactory = Persistence.createEntityManagerFactory("contact");
//        }
//        EntityManager manager = managerFactory.createEntityManager();
        return entityManager;
    }
}

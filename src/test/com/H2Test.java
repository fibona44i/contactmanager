package com;

import javax.persistence.PersistenceContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.fibo.contactmanager.dao.ContactDAO;
import com.fibo.contactmanager.domain.Contact;
import static org.junit.Assert.assertNotNull;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/test-context.xml"})
public class H2Test {

    @PersistenceContext
    private javax.persistence.EntityManager em;

    @Autowired
    private ContactDAO contactDAO;


    @Before
    public void init() {
        System.identityHashCode(this);
        assertNotNull(em);
//        em.persist(dcd);
//        em.flush();
//        em.clear();
    }

    @Test
    @Rollback(true)
    public void testStore() {
        Contact contact = new Contact();
        contact.setEmail("ddd");
        contact.setFirstname("firstName");
        contact.setLastname("lastName");
        contactDAO.addContact(contact);

////        Session session = new Configuration().configure("hibernate.cfg.xml")
////                                             .buildSessionFactory()
////                                             .openSession();
////        em.getTransaction().begin();
//
//        ArrayList<String> list1 = new ArrayList<String>();
//        list1.add("java is a programming language");
//        list1.add("java is a platform");
//
//        ArrayList<String> list2 = new ArrayList<String>();
//        list2.add("Servlet is an Interface");
//        list2.add("Servlet is an API");
//
//        Question question1 = new Question();
//        question1.setQname("What is Java?");
//        question1.setAnswers(list1);
//
//        Question question2 = new Question();
//        question2.setQname("What is Servlet?");
//        question2.setAnswers(list2);
//
//        em.persist(question1);
//        em.persist(question2);
//
//        Query query = em.createQuery("from Question");
//        List<Question> list = (List<Question>) query.getResultList();
//
//        Iterator<Question> itr = list.iterator();
//        while (itr.hasNext()) {
//            Question q = itr.next();
//            System.out.println("Question Name: " + q.getQname());
//
//            //printing answers
//            List<String> list3 = q.getAnswers();
//            Iterator<String> itr2 = list3.iterator();
//            while (itr2.hasNext()) {
//                System.out.println(itr2.next());
//            }
//        }
//
//        //  em.commit();
//        // session.close();
//        System.out.println("success");
    }
}
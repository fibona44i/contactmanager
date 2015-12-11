import javax.persistence.PersistenceContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.assertNotNull;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class H2Test {

    @PersistenceContext
    private javax.persistence.EntityManager em;

    @Before
    public void init() {
        assertNotNull(em);
//        em.persist(dcd);
//        em.flush();
//        em.clear();
    }

    @Test
    public void testGet() {
//        DataCollectionDefinition found = em.find(DataCollectionDefinition.class, 1);
//        Assert.assertEquals(found, dcd);
    }
}
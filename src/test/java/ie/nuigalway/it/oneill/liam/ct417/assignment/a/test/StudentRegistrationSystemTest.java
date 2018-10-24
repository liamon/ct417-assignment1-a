package ie.nuigalway.it.oneill.liam.ct417.assignment.a.test;

import ie.nuigalway.it.oneill.liam.ct417.assignment1.a.Student;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liam
 */
public class StudentRegistrationSystemTest {
    
    public StudentRegistrationSystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGetUsername() {
        Student student = new Student();
        student.setName("Cathal Burke");
        student.setDob(new LocalDate(1998, 10, 15)); // Will calculate age automatically
        // Deciding that getUsername() wil lalso remove any spaces in the name.
        assertEquals("CathalBurke20", student.getUsername());
    }
}

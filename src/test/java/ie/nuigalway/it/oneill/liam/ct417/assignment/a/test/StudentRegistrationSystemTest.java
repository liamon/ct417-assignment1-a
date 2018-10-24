package ie.nuigalway.it.oneill.liam.ct417.assignment.a.test;

import ie.nuigalway.it.oneill.liam.ct417.assignment1.a.Student;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liam
 */
public class StudentRegistrationSystemTest {
    
    @Test
    public void testGetUsername() {
        Student student = new Student();
        student.setName("Cathal Burke");
        student.setDob(new LocalDate(1998, 10, 15)); // Will calculate age automatically
        // Deciding that getUsername() wil lalso remove any spaces in the name.
        assertEquals("CathalBurke20", student.getUsername());
    }
}

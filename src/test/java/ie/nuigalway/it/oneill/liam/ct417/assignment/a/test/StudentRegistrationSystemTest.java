package ie.nuigalway.it.oneill.liam.ct417.assignment.a.test;

import ie.nuigalway.it.oneill.liam.ct417.assignment1.a.Course;
import ie.nuigalway.it.oneill.liam.ct417.assignment1.a.Module;
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
        // Deciding that getUsername() will also remove any spaces in the name.
        assertEquals("CathalBurke20", student.getUsername());
    }
    
    @Test
    public void testNoDuplication() {
        Module module = new Module();
        Student student = new Student();
        module.addStudents(student, student, student);
        assertEquals(1, module.getStudents().size());
        // Module, Student and Course all have the same implementation so I do not need to test each one.
    }
    
    @Test
    public void testAddingToEachOther() {
        Module module = new Module();
        Course course = new Course();
        course.addModules(module);
        assertTrue(module.getCourses().contains(course));
        // Module, Student and Course all have the same implementation so I do not need to test each one.
    }
}

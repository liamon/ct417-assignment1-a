package ie.nuigalway.it.oneill.liam.ct417.assignment1.a;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.LocalDate;

/**
 *
 * @author Liam
 */
public class Course {
    private String name;
    private Set<Module> modules = new HashSet<>();
    private Set<Student> students = new HashSet<>();
    private LocalDate startDate;
    private LocalDate endDate;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the modules
     */
    public Set<Module> getModules() {
        return modules;
    }

    /**
     * @param modules the modules to set
     */
    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }
    
    /**
     * @param modules the modules to add
     */
    public void addModules(Module... modules) {
        this.modules.addAll(Arrays.asList(modules));
    }

    /**
     * @return the students
     */
    public Set<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    
    /**
     * @param students the students to add
     */
    public void addStudents(Student... students) {
        this.students.addAll(Arrays.asList(students));
    }

    /**
     * @return the startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}

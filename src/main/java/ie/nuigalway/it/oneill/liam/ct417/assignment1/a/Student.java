package ie.nuigalway.it.oneill.liam.ct417.assignment1.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 *
 * @author Liam
 */
public class Student {
    private String name;
    private LocalDate dob;
    private String id;
    private List<Course> courses = new ArrayList<>();
    private List<Module> modules = new ArrayList<>();
    
    /**
     * @return the username, consisting of the name stripped of whitespace concatenated to the age
     */
    public String getUsername() {
        return name.replaceAll("\\s", "") + getAge();
    }

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
     * @return the age, generated from the dob
     */
    public int getAge() {
        return Years.yearsBetween(dob, new LocalDate()).getYears();
    }

    /**
     * @return the dob
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the courses
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    /**
     * @param courses the courses to add
     */
    public void addCourses(Course... courses) {
        this.courses.addAll(Arrays.asList(courses));
    }

    /**
     * @return the modules
     */
    public List<Module> getModules() {
        return modules;
    }

    /**
     * @param modules the modules to set
     */
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
    
    /**
     * @param modules the modules to add
     */
    public void addModules(Module... modules) {
        this.modules.addAll(Arrays.asList(modules));
    }
}

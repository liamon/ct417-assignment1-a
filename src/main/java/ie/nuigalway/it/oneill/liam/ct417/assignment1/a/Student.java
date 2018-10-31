package ie.nuigalway.it.oneill.liam.ct417.assignment1.a;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
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
    private Set<Course> courses = new HashSet<>();
    private Set<Module> modules = new HashSet<>();
    
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
    public Set<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
    
    // For the add methods, even if a variable appears in the input more than once,
    // I verified because it is a Set it will only get added once.
    
    /**
     * @param courses the courses to add
     */
    public void addCourses(Course... courses) {
        this.courses.addAll(Arrays.asList(courses));
        Stream.of(courses).forEach((course) -> {
            if (!course.getStudents().contains(this)) {
                course.addStudents(this);
            }
        });
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
        Stream.of(modules).forEach((module) -> {
            if (!module.getStudents().contains(this)) {
                module.addStudents(this);
            }
        });
    }
}

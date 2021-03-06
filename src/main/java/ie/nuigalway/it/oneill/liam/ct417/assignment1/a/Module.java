/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.it.oneill.liam.ct417.assignment1.a;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author Liam
 */
public class Module {
    private String name;
    private String id;
    private Set<Student> students = new HashSet<>();
    private Set<Course> courses = new HashSet<>();

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
        Stream.of(students).forEach((student) -> {
            if (!student.getModules().contains(this)) {
                student.addModules(this);
            }
        });
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
    
    /**
     * @param courses the courses to add
     */
    public void addCourses(Course... courses) {
        this.courses.addAll(Arrays.asList(courses));
        Stream.of(courses).forEach((course) -> {
            if (!course.getModules().contains(this)) {
                course.addModules(this);
            }
        });
    }
}

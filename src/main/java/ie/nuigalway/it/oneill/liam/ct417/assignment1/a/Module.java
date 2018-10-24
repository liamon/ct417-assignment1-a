/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.it.oneill.liam.ct417.assignment1.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Liam
 */
public class Module {
    private String name;
    private String id;
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

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
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    /**
     * @param students the students to add
     */
    public void addStudents(Student... students) {
        this.students.addAll(Arrays.asList(students));
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
}

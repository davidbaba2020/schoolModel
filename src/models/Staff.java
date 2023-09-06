package models;

import enus.DESIGNATION;

import java.util.List;

public class Staff implements Comparable<Staff>{
    private int id;
    private DESIGNATION designation;
    private String name;
    private List<Course> courses;

    public Staff() {
    }

    public Staff(int id, DESIGNATION designation, String name, List<Course> courses) {
        this.id = id;
        this.designation = designation;
        this.name = name;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DESIGNATION getDesignation() {
        return designation;
    }

    public void setDesignation(DESIGNATION designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
//                ", designation=" + designation +
//                ", name='" + name + '\'' +
//                ", courses=" + courses +
                '}';
    }

    @Override
    public int compareTo(Staff that) {
        return this.getId()-that.getId();
    }
}

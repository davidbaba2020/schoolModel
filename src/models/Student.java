package models;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String emailAddress;
    private String phoneNo;
    private String level;
    private List<Course> listOfCourseToTake;
    private int strikes;
    private int age;
    private List<Course> subjectsOffering;
    private Double performanceAverage;


    public Student() {
    }

    public Student(int id, String name, String emailAddress, String phoneNo, String level, List<Course> listOfCourseToTake, int strikes, int age, List<Course> subjectsOffering, Double performanceAverage) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
        this.level = level;
        this.listOfCourseToTake = listOfCourseToTake;
        this.strikes = strikes;
        this.age = age;
        this.subjectsOffering = subjectsOffering;
        this.performanceAverage = performanceAverage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Course> getListOfCourseToTake() {
        return listOfCourseToTake;
    }

    public void setListOfCourseToTake(List<Course> listOfCourseToTake) {
        this.listOfCourseToTake = listOfCourseToTake;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getSubjectsOffering() {
        return subjectsOffering;
    }

    public void setSubjectsOffering(List<Course> subjectsOffering) {
        this.subjectsOffering = subjectsOffering;
    }

    public Double getPerformanceAverage() {
        return performanceAverage;
    }

    public void setPerformanceAverage(Double performanceAverage) {
        this.performanceAverage = performanceAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", level='" + level + '\'' +
                ", listOfCourseToTake=" + listOfCourseToTake +
                ", strikes=" + strikes +
                ", age=" + age +
                ", subjectsOffering=" + subjectsOffering +
                ", performanceAverage=" + performanceAverage +
                '}';
    }
}

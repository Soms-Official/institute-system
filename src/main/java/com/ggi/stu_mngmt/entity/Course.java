package com.ggi.stu_mngmt.entity;

import jakarta.persistence.*;


import java.util.*;

@Entity

public class Course {
    @Id
    private String courseId;
    private String courseName;
    private String duration;
    private double fees;
    private int seats;

//    @OneToMany(mappedBy = "course")
//    private List<Student> students;

    // Getters & Setters

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course course)) return false;
        return Double.compare(fees, course.fees) == 0 && seats == course.seats && Objects.equals(courseId, course.courseId) && Objects.equals(courseName, course.courseName) && Objects.equals(duration, course.duration) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, duration, fees, seats);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", fees=" + fees +
                ", seats=" + seats +
                '}';
    }
}

package com.ggi.stu_mngmt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roll;
    private String name;
    private String dob;
    private String address;
    private String email;
    private String mobile;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private double totalFees;
    private double remainingFees;

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public double getRemainingFees() {
        return remainingFees;
    }

    public void setRemainingFees(double remainingFees) {
        this.remainingFees = remainingFees;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Double.compare(totalFees, student.totalFees) == 0 && Double.compare(remainingFees, student.remainingFees) == 0 && Objects.equals(id, student.id) && Objects.equals(roll, student.roll) && Objects.equals(name, student.name) && Objects.equals(dob, student.dob) && Objects.equals(address, student.address) && Objects.equals(email, student.email) && Objects.equals(mobile, student.mobile) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roll, name, dob, address, email, mobile, course, totalFees, remainingFees);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", roll='" + roll + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", course=" + course +
                ", totalFees=" + totalFees +
                ", remainingFees=" + remainingFees +
                '}';
    }
}
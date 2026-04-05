package com.ggi.stu_mngmt.model;



import java.util.Objects;

public class StudentDTO {
    private String roll;
    private String name;
    private String dob;
    private String address;
    private String email;
    private String mobile;
    private String course;
    private Integer semYear;
    private String duration;
    private double totalFees;
    private double remainingFees;

    // Getters & Setters


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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public Integer getSemYear() {
        return semYear;
    }
    public void setSemYear(Integer semYear) {
        this.semYear = semYear;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
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
    public String toString() {
        return "Student{" +
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
package com.ggi.stu_mngmt.Queries;

public class QueryConstant {
    public static final String GET_STUDENT_BY_COURSE_AND_SEMESTER = "SELECT s.id, s.roll,s.name, s.dob,s.course_id,s.address,s.mobile,s.email,s.sem_year,s.total_fees,s.remaining_fees FROM Student s join Course c on s.course_id = c.course_id WHERE c.course_name = :course and s.sem_year = :semYear";
    public static final String GET_STUDENT_BY_ROLL = "SELECT * FROM Student s WHERE s.roll = :roll";
    public static final String GET_PAYMENT_BY_STUDENT_ID = "SELECT * FROM Payment p WHERE p.student_id = ?1";
    public static final String GET_ALL_PAYMENTS = "SELECT * FROM Payment p";
    public static final String GET_ALL_COURSES = "SELECT * FROM Course c";
    public static final String GET_COURSE_BY_NAME = "SELECT * FROM Course c WHERE c.course_name = :course";
}

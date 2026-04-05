package com.ggi.stu_mngmt.repository;

import com.ggi.stu_mngmt.Queries.QueryConstant;
import com.ggi.stu_mngmt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
//    List<Student> findByCourse_CourseId(String courseId);
    @Query(value = QueryConstant.GET_STUDENT_BY_COURSE_AND_SEMESTER,nativeQuery = true)
    List<Student> findByCourseAndSemester(String course, String semYear);

    @Query(value = QueryConstant.GET_STUDENT_BY_ROLL, nativeQuery = true)
    Optional<Student> findByRoll(String roll);
}
package com.ggi.stu_mngmt.repository;

import com.ggi.stu_mngmt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> findByCourse_CourseId(String courseId);
}
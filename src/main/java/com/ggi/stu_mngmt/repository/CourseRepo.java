package com.ggi.stu_mngmt.repository;
import com.ggi.stu_mngmt.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, String> {}
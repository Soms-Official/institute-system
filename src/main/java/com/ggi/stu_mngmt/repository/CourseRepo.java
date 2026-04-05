package com.ggi.stu_mngmt.repository;
import com.ggi.stu_mngmt.Queries.QueryConstant;
import com.ggi.stu_mngmt.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepo extends JpaRepository<Course, String> {
    @Query(value = QueryConstant.GET_COURSE_BY_NAME, nativeQuery = true)
    Course findByCourseName(String course);
}
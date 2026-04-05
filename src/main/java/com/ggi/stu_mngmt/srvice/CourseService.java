package com.ggi.stu_mngmt.srvice;

import com.ggi.stu_mngmt.entity.Course;
import com.ggi.stu_mngmt.repository.CourseRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public Course add(Course c) { return courseRepo.save(c); }

    public List<Course> getAll() { return courseRepo.findAll(); }
}
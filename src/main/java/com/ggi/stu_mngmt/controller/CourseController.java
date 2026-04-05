package com.ggi.stu_mngmt.controller;

import com.ggi.stu_mngmt.entity.Course;


import com.ggi.stu_mngmt.repository.CourseRepo;
import com.ggi.stu_mngmt.srvice.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public Course add(@RequestBody Course c) { return courseService.add(c); }
    @GetMapping("/all")
    public List<Course> getAll() { return courseService.getAll(); }
}
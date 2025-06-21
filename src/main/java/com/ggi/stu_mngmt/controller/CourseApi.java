package com.ggi.stu_mngmt.controller;

import com.ggi.stu_mngmt.entity.Course;


import com.ggi.stu_mngmt.repository.CourseRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/courses")
public class CourseApi {
    private final CourseRepo repository;

    public CourseApi(CourseRepo repository) {
        this.repository = repository;
    }

    @PostMapping
    public Course add(@RequestBody Course c) { return repository.save(c); }
    @GetMapping
    public List<Course> getAll() { return repository.findAll(); }
}
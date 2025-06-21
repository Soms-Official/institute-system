package com.ggi.stu_mngmt.controller;

import com.ggi.stu_mngmt.entity.Course;
import com.ggi.stu_mngmt.entity.Student;
import com.ggi.stu_mngmt.model.*;
import com.ggi.stu_mngmt.repository.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentApi {
    private final StudentRepo repo;
    private final CourseRepo courseRepo;

    public StudentApi(StudentRepo repo, CourseRepo courseRepo) {
        this.repo = repo;
        this.courseRepo = courseRepo;
    }

    @PostMapping("/add")
    public Student add(@RequestBody Student s) {
        Course c = courseRepo.findById(s.getCourse().getCourseId()).orElse(null);
        s.setCourse(c);
        s.setTotalFees(c.getFees());
        s.setRemainingFees(c.getFees());
        return repo.save(s);
    }

    @GetMapping("/course/{id}")
    public List<Student> getByCourse(@PathVariable String id) {
        return repo.findByCourse_CourseId(id);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }
}
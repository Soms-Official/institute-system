package com.ggi.stu_mngmt.controller;

import com.ggi.stu_mngmt.entity.Teacher;
import com.ggi.stu_mngmt.repository.TeacherRepo;
import com.ggi.stu_mngmt.srvice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@CrossOrigin(origins = "http://localhost:3000")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @PostMapping
    public Teacher add(@RequestBody Teacher t) { return teacherService.add(t); }

    @GetMapping
    public List<Teacher> getAll() { return teacherService.getAll(); }

    @GetMapping("/{id}")
    public Teacher getById(@PathVariable Long id) { return teacherService.getById(id); }

}
package com.ggi.stu_mngmt.controller;

import com.ggi.stu_mngmt.entity.Teacher;
import com.ggi.stu_mngmt.model.TeacherDTO;
import com.ggi.stu_mngmt.repository.TeacherRepo;
import com.ggi.stu_mngmt.repository.TeacherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@CrossOrigin(origins = "http://localhost:3000")
public class TeacherApi {
    private final TeacherRepo repo;

    public TeacherApi(TeacherRepo repo) {
        this.repo = repo;
    }

    @PostMapping
    public Teacher add(@RequestBody Teacher t) { return repo.save(t); }

    @GetMapping
    public List<Teacher> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Teacher getById(@PathVariable Long id) { return repo.findById(id).orElse(null); }
}
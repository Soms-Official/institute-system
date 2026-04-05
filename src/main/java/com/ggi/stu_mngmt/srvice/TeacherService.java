package com.ggi.stu_mngmt.srvice;

import com.ggi.stu_mngmt.entity.Teacher;
import com.ggi.stu_mngmt.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo repo;


    public Teacher add(Teacher t) { return repo.save(t); }

    public List<Teacher> getAll() { return repo.findAll(); }

    public Teacher getById(Long id) { return repo.findById(id).orElse(null); }
}
package com.ggi.stu_mngmt.controller;

import com.ggi.stu_mngmt.entity.Course;
import com.ggi.stu_mngmt.entity.Student;
import com.ggi.stu_mngmt.model.StudentDTO;
import com.ggi.stu_mngmt.repository.CourseRepo;
import com.ggi.stu_mngmt.repository.StudentRepo;
import com.ggi.stu_mngmt.srvice.CourseService;
import com.ggi.stu_mngmt.srvice.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService ;
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public void add(@RequestBody StudentDTO sd) {
        studentService.add(sd);

    }

    @GetMapping("/filter")
    public List<StudentDTO> getByCourseAndSemester(@RequestParam String course, @RequestParam String semYear) {
        List<StudentDTO> studentDTOs = studentService.getByCourseAndSemester(course, semYear);
        return studentDTOs;
    }

    @GetMapping("/{roll}")
    public StudentDTO getById(@PathVariable String roll) {
        return studentService.getById(roll);
    }

    @GetMapping("/all")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @PutMapping("/pay")
    public Student makePayment(@RequestParam String roll, @RequestParam double amount) {
        return studentService.makePayment(roll, amount);
    }
}
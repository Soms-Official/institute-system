package com.ggi.stu_mngmt.srvice;

import com.ggi.stu_mngmt.entity.Course;
import com.ggi.stu_mngmt.entity.Student;
import com.ggi.stu_mngmt.model.StudentDTO;
import com.ggi.stu_mngmt.repository.CourseRepo;
import com.ggi.stu_mngmt.repository.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private StudentRepo studentRepo ;
    @Autowired
    private CourseRepo courseRepo;

    public Student add(StudentDTO sd) {
        System.out.println(sd.getCourse());
        Course c = courseRepo.findByCourseName(sd.getCourse());
        logger.info(sd.toString());
        Student s = new Student();
        s.setAddress(sd.getAddress());
        s.setDob(sd.getDob());
        s.setName(sd.getName());
        s.setMobile(sd.getMobile());
        s.setEmail(sd.getEmail());
        s.setRoll(sd.getRoll());
        s.setCourse(c);
        s.setSemYear(sd.getSemYear());
        s.setTotalFees(c.getFees());
        s.setRemainingFees(c.getFees());
        return studentRepo.save(s);
    }

    public List<StudentDTO> getByCourseAndSemester(String course, String semYear) {
        List<Student> students = studentRepo.findByCourseAndSemester(course, semYear);
        List<StudentDTO> studentDTOs = new ArrayList<>();
        for (Student student : students) {
            StudentDTO dto = new StudentDTO();
            dto.setRoll(student.getRoll());
            dto.setName(student.getName());
            dto.setDob(student.getDob());
            dto.setAddress(student.getAddress());
            dto.setEmail(student.getEmail());
            dto.setMobile(student.getMobile());
            dto.setCourse(student.getCourse().getCourseName());
            dto.setSemYear(student.getSemYear());
            dto.setTotalFees(student.getTotalFees());
            dto.setRemainingFees(student.getRemainingFees());
            studentDTOs.add(dto);
        }
        return studentDTOs;
    }

    public StudentDTO getById(String roll) {
        Optional<Student> Optstudent = studentRepo.findByRoll(roll);
        if (Optstudent.isEmpty()) {
            throw new RuntimeException("Student not found");
        }
        else{
            Student student = Optstudent.get();
            StudentDTO dto = new StudentDTO();
            dto.setRoll(student.getRoll());
            dto.setName(student.getName());
            dto.setDob(student.getDob());
            dto.setAddress(student.getAddress());
            dto.setEmail(student.getEmail());
            dto.setMobile(student.getMobile());
            dto.setCourse(student.getCourse().getCourseName());
            dto.setSemYear(student.getSemYear());
            dto.setDuration(student.getCourse().getDuration());
            dto.setTotalFees(student.getTotalFees());
            dto.setRemainingFees(student.getRemainingFees());
            return dto;
        }
    }

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student makePayment(String roll, double amount) {
        Optional<Student> Optstudent = studentRepo.findByRoll(roll);
        if (Optstudent.isEmpty()) {
            throw new RuntimeException("Student not found");
        } else {
            Student student = Optstudent.get();
            double remainingFees = student.getRemainingFees() - amount;
            student.setRemainingFees(remainingFees);
            return studentRepo.save(student);
        }
    }
}
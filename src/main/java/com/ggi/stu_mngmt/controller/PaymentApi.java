package com.ggi.stu_mngmt.controller;

import com.ggi.stu_mngmt.entity.Payment;
import com.ggi.stu_mngmt.entity.Student;
import com.ggi.stu_mngmt.model.*;
import com.ggi.stu_mngmt.repository.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/payments")
@CrossOrigin(origins = "http://localhost:3000")
public class PaymentApi {
    private final StudentRepo studentRepo;
    private final PaymentRepo paymentRepo;

    public PaymentApi(StudentRepo studentRepo, PaymentRepo receiptRepo) {
        this.studentRepo = studentRepo;
        this.paymentRepo = receiptRepo;
    }

    @GetMapping("/student/{id}")
    public Student getStudentInfo(@PathVariable Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @PostMapping("/pay")
    public Payment pay(@RequestParam Long studentId, @RequestParam double amount) {
        Student s = studentRepo.findById(studentId).orElseThrow();
        s.setRemainingFees(s.getRemainingFees() - amount);
        studentRepo.save(s);

        Payment pr = new Payment();
        pr.setStudent(s);
        pr.setAmount(amount);
        pr.setDate(LocalDate.now());
        pr.setReceiptBlob(("Paid " + amount).getBytes());

        return paymentRepo.save(pr);
    }
}
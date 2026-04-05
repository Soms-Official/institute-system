package com.ggi.stu_mngmt.controller;
//import com.ggi.stu_mngmt.entity.Payment;
//import com.ggi.stu_mngmt.entity.Student;
//
//import com.ggi.stu_mngmt.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import java.time.LocalDate;
//import java.io.ByteArrayOutputStream;

//@RestController
//@RequestMapping("/payments")
//@CrossOrigin(origins = "http://localhost:3000")
public class PaymentController {
//
//    @Autowired
//    private PaymentRepo paymentRepo;
//
//    @Autowired
//    private StudentRepo studentRepo;
//
//    public Payment makePayment(Long studentId, double amount) throws Exception {
//        Student student = studentRepo.findById(studentId)
//                .orElseThrow(() -> new RuntimeException("Student not found"));
//
//        Payment payment = new Payment();
//        payment.setStudent(student);
//        payment.setAmount(amount);
//        payment.setDate(LocalDate.now());
//
//        // Generate receipt as PDF (Blob)
//        byte[] receiptBytes = generateReceipt(student, amount);
//        payment.setReceiptBlob(receiptBytes);
//
//        return paymentRepo.save(payment);
//    }
//
//    private byte[] generateReceipt(Student student, double amount) throws DocumentException {
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        Document document = new Document();
//        PdfWriter.getInstance(document, out);
//
//        document.open();
//        document.add(new Paragraph("---- Payment Receipt ----"));
//        document.add(new Paragraph("Student: " + student.getName()));
//        document.add(new Paragraph("Email: " + student.getEmail()));
//        document.add(new Paragraph("Course: " + student.getCourse().getName()));
//        document.add(new Paragraph("Amount Paid: ₹" + amount));
//        document.add(new Paragraph("Date: " + LocalDate.now()));
//        document.add(new Paragraph("---------------------------"));
//        document.close();
//
//        return out.toByteArray();
//    }
//
//
////    @GetMapping("/student/{id}")
////    public Student getStudentInfo(@PathVariable Long id) {
////        return studentRepo.findById(id).orElse(null);
////    }
////
////    @PostMapping("/pay")
////    public Payment pay(@RequestParam Long studentId, @RequestParam double amount) {
////        Student s = studentRepo.findById(studentId).orElseThrow();
////        s.setRemainingFees(s.getRemainingFees() - amount);
////        studentRepo.save(s);
////
////        Payment pr = new Payment();
////        pr.setStudent(s);
////        pr.setAmount(amount);
////        pr.setDate(LocalDate.now());
////        pr.setReceiptBlob(("Paid " + amount).getBytes());
////
////        return paymentRepo.save(pr);
////    }
}

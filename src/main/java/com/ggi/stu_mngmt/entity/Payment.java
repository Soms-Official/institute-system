package com.ggi.stu_mngmt.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    private double amount;
    private LocalDate date;

    @Lob
    private byte[] receiptBlob;

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public byte[] getReceiptBlob() {
        return receiptBlob;
    }

    public void setReceiptBlob(byte[] receiptBlob) {
        this.receiptBlob = receiptBlob;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Payment payment)) return false;
        return Double.compare(amount, payment.amount) == 0 && Objects.equals(id, payment.id) && Objects.equals(student, payment.student) && Objects.equals(date, payment.date) && Objects.deepEquals(receiptBlob, payment.receiptBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student, amount, date, Arrays.hashCode(receiptBlob));
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", student=" + student +
                ", amount=" + amount +
                ", date=" + date +
                ", receiptBlob=" + Arrays.toString(receiptBlob) +
                '}';
    }
}
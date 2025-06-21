package com.ggi.stu_mngmt.repository;

import com.ggi.stu_mngmt.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {}
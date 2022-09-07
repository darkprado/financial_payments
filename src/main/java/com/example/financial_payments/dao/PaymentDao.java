package com.example.financial_payments.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.financial_payments.entity.Payment;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@Repository
public interface PaymentDao extends JpaRepository<Payment, Long> {

    List<Payment> findAllByUserId(long id);

}

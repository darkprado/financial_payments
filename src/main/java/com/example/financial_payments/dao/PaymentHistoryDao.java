package com.example.financial_payments.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.financial_payments.entity.PaymentHistory;

/**
 * @author s.melekhin
 * @since 05 сент. 2022 г.
 */
public interface PaymentHistoryDao extends CrudRepository<PaymentHistory, Long> {

    List<PaymentHistory> findAllByPaymentId(long id);

}

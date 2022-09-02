package com.example.financial_payments.service;

import java.util.List;

import com.example.financial_payments.dto.PaymentDto;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
public interface PaymentService {

    long persist(PaymentDto paymentDto);

    PaymentDto getById(long id);

    List<PaymentDto> getByUserId(long id);

}

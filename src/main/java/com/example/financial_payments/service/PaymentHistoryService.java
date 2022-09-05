package com.example.financial_payments.service;

import java.util.List;

import com.example.financial_payments.dto.PaymentHistoryDto;

/**
 * @author s.melekhin
 * @since 05 сент. 2022 г.
 */
public interface PaymentHistoryService {

    long persist(PaymentHistoryDto paymentHistoryDto);

    PaymentHistoryDto getById(long id);

    List<PaymentHistoryDto> getByUserId(long id);

}

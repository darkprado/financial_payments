package com.example.financial_payments.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.financial_payments.dao.PaymentHistoryDao;
import com.example.financial_payments.dto.PaymentHistoryDto;
import com.example.financial_payments.exception.PaymentHistoryNotFoundException;
import com.example.financial_payments.mapper.PaymentHistoryMapper;
import com.example.financial_payments.service.PaymentHistoryService;

import lombok.RequiredArgsConstructor;

/**
 * @author s.melekhin
 * @since 05 сент. 2022 г.
 */
@RequiredArgsConstructor
@Service
public class PaymentHistoryServiceImpl implements PaymentHistoryService {

    private final PaymentHistoryDao dao;
    private final PaymentHistoryMapper mapper;

    @Override
    public long persist(PaymentHistoryDto paymentHistoryDto) {
        return dao.save(mapper.paymentHistoryDtoToPaymentHistory(paymentHistoryDto)).getId();
    }

    @Override
    public PaymentHistoryDto getById(long paymentId) {
        return mapper.paymentHistoryToPaymentHistoryDto(dao.findById(paymentId).orElseThrow(() -> new PaymentHistoryNotFoundException(paymentId)));
    }

    @Override
    public List<PaymentHistoryDto> getByUserId(long paymentId) {
        return dao.findAllByPaymentId(paymentId).stream().map(mapper::paymentHistoryToPaymentHistoryDto).collect(Collectors.toList());
    }
}

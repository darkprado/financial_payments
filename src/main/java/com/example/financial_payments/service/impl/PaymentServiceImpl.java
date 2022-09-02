package com.example.financial_payments.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.financial_payments.dao.PaymentDao;
import com.example.financial_payments.dto.PaymentDto;
import com.example.financial_payments.exception.PaymentNotFoundException;
import com.example.financial_payments.mapper.PaymentMapper;
import com.example.financial_payments.service.PaymentService;

import lombok.RequiredArgsConstructor;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentDao dao;
    private final PaymentMapper mapper;

    @Override
    public long persist(PaymentDto paymentDto) {
        return dao.save(mapper.paymentDtoToPayment(paymentDto)).getId();
    }

    @Override
    public PaymentDto getById(long id) {
        return mapper.paymentToPaymentDto(dao.findById(id).orElseThrow(() -> new PaymentNotFoundException(id)));
    }

    @Override
    public List<PaymentDto> getByUserId(long userId) {
        return dao.findAllByUserId(userId).stream().map(mapper::paymentToPaymentDto).collect(Collectors.toList());
    }
}

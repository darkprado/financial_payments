package com.example.financial_payments.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.financial_payments.dto.PaymentHistoryDto;
import com.example.financial_payments.service.PaymentHistoryService;

import lombok.RequiredArgsConstructor;

/**
 * @author s.melekhin
 * @since 05 сент. 2022 г.
 */
@RestController
@RequestMapping("payment/history")
@RequiredArgsConstructor
public class PaymentHistoryController {

    private final PaymentHistoryService service;

    @PostMapping
    public ResponseEntity<Long> persist(@Valid @RequestBody PaymentHistoryDto paymentHistoryDto) {
        return ResponseEntity.ok(service.persist(paymentHistoryDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentHistoryDto> getPaymentHistoryById(@PathVariable long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("all/payment/{paymentId}")
    public ResponseEntity<List<PaymentHistoryDto>> getAllPaymentByUserId(@PathVariable long paymentId) {
        return ResponseEntity.ok(service.getByUserId(paymentId));
    }

}

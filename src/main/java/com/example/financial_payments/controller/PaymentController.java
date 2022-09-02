package com.example.financial_payments.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.financial_payments.dto.PaymentDto;
import com.example.financial_payments.service.PaymentService;

import lombok.RequiredArgsConstructor;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@RestController
@RequestMapping("payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;

    @PostMapping
    public ResponseEntity<Long> persist(@Valid @RequestBody PaymentDto paymentDto) {
        return ResponseEntity.ok(service.persist(paymentDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentDto> getPaymentById(@PathVariable long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("all/user/{userId}")
    public ResponseEntity<List<PaymentDto>> getAllPaymentByUserId(@PathVariable long userId) {
        return ResponseEntity.ok(service.getByUserId(userId));
    }

}

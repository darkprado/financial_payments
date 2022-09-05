package com.example.financial_payments.exception;

/**
 * @author s.melekhin
 * @since 05 сент. 2022 г.
 */
public class PaymentHistoryNotFoundException extends RuntimeException {

    public PaymentHistoryNotFoundException(long id) {
        super(String.format("Payment history with id %s not found", id));
    }

}

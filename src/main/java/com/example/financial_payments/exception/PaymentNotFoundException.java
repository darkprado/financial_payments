package com.example.financial_payments.exception;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
public class PaymentNotFoundException extends RuntimeException {

    public PaymentNotFoundException(long id) {
        super(String.format("Payment with id %s not found", id));
    }

}

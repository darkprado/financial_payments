package com.example.financial_payments.exception;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(long id) {
        super(String.format("User with id %s not found", id));
    }

}

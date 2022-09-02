package com.example.financial_payments.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.financial_payments.entity.Payment;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
public class UserDto {

    private long id;
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate birthday;

}

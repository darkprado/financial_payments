package com.example.financial_payments.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private long id;
    @NotBlank(message = "Login is mandatory")
    private String login;
    @NotBlank(message = "Password is mandatory")
    private String password;
    @NotBlank(message = "Firstname is mandatory")
    private String firstname;
    @NotBlank(message = "Lastname is mandatory")
    private String lastname;
    @NotBlank(message = "Email is mandatory")
    private String email;
    @Past(message = "Birthday is mandatory")
    private Timestamp birthday;

}

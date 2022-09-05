package com.example.financial_payments.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class PaymentDto {

    private long id;
    @NotNull(message = "UserId is mandatory")
    private long userId;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotNull(message = "Price is mandatory")
    private int price;

}

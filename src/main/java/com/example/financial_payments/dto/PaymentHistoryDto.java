package com.example.financial_payments.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author s.melekhin
 * @since 05 сент. 2022 г.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentHistoryDto {

    private long id;
    @NotNull(message = "PaymentId is mandatory")
    private long paymentId;
    @NotNull(message = "Year is mandatory")
    private int year;
    @NotNull(message = "Month is mandatory")
    private int month;

}

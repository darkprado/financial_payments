package com.example.financial_payments.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.financial_payments.dto.PaymentDto;
import com.example.financial_payments.entity.Payment;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@Mapper(componentModel = "spring")
public interface PaymentMapper {

    @Mapping(target = "user.id", source = "userId")
    Payment paymentDtoToPayment(PaymentDto paymentDto);

    @Mapping(target = "userId", source = "user.id")
    PaymentDto paymentToPaymentDto(Payment payment);

}

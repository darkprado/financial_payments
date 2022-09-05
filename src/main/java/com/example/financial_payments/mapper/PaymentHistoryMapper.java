package com.example.financial_payments.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.financial_payments.dto.PaymentHistoryDto;
import com.example.financial_payments.entity.PaymentHistory;

/**
 * @author s.melekhin
 * @since 05 сент. 2022 г.
 */
@Mapper(componentModel = "spring")
public interface PaymentHistoryMapper {

    @Mapping(target = "payment.id", source = "paymentId")
    PaymentHistory paymentHistoryDtoToPaymentHistory(PaymentHistoryDto paymentHistoryDto);

    @Mapping(target = "paymentId", source = "payment.id")
    PaymentHistoryDto paymentHistoryToPaymentHistoryDto(PaymentHistory payment);

}

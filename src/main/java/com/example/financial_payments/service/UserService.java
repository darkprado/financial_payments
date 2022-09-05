package com.example.financial_payments.service;

import com.example.financial_payments.dto.UserDto;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
public interface UserService {

    long persist(UserDto userDto);

    UserDto getById(long id);

}

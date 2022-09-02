package com.example.financial_payments.service;

import org.springframework.stereotype.Service;

import com.example.financial_payments.dao.UserDao;
import com.example.financial_payments.dto.UserDto;

import lombok.RequiredArgsConstructor;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
public interface UserService {

    long persist(UserDto userDto);

    UserDto getById(long id);



}

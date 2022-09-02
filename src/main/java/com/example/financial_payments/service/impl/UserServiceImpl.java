package com.example.financial_payments.service.impl;

import org.springframework.stereotype.Service;

import com.example.financial_payments.dao.UserDao;
import com.example.financial_payments.dto.UserDto;
import com.example.financial_payments.exception.UserNotFoundException;
import com.example.financial_payments.mapper.UserMapper;
import com.example.financial_payments.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao dao;
    private final UserMapper mapper;

    @Override
    public long persist(UserDto userDto) {
        return dao.save(mapper.userDtoToUser(userDto)).getId();
    }

    @Override
    public UserDto getById(long id) {
        return mapper.userToUserDto(dao.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }
}

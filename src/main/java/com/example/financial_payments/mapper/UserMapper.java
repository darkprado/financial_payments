package com.example.financial_payments.mapper;

import org.mapstruct.Mapper;

import com.example.financial_payments.dto.UserDto;
import com.example.financial_payments.entity.User;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);

}

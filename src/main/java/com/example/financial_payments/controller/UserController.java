package com.example.financial_payments.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.financial_payments.dto.UserDto;
import com.example.financial_payments.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * @author s.melekhin
 * @since 02 сент. 2022 г.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> persist(@Valid @RequestBody UserDto userDto) {
        return ResponseEntity.ok(service.persist(userDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable long id) {
        return ResponseEntity.ok(service.getById(id));
    }

}

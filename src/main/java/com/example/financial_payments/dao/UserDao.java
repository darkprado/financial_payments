package com.example.financial_payments.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.financial_payments.entity.User;

/**
 * @author s.melekhin
 * @since 03 авг. 2022 г.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {

}

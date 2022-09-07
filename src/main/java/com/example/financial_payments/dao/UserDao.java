package com.example.financial_payments.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.financial_payments.entity.User;

/**
 * @author s.melekhin
 * @since 03 авг. 2022 г.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

    Optional<User> findUserByLogin(String login);

}

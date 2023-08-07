package com.repositories;

import com.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailEqualsIgnoreCase(String email);

    User findByEmailIgnoreCaseEquals(String username);
    User findByPasswordEquals(String password);



}
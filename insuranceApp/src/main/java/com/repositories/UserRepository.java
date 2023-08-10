package com.repositories;

import com.entities.UserEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntitiy, Long> {

    Optional<UserEntitiy> findByEmailEqualsIgnoreCase(String email);

    Optional<UserEntitiy> findByEmailEqualsIgnoreCaseAndPasswordEquals(String email, String password);




}
package com.service;


import com.entities.User;
import com.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    final PasswordEncoder passwordEncoder;
    final UserRepository userRepository;

    public User register(User user){

        Optional<User> optionalCustomer = userRepository.findByEmailEqualsIgnoreCase(user.getEmail());
        if(optionalCustomer.isPresent()){
            return null;
        }else {
            String newPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(newPassword);
            userRepository.save(user);
            return user;
        }
    }

}

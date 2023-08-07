package com.service;


import com.configs.Standard;
import com.entities.User;
import com.repositories.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    /*  public ResponseEntity save (User user){
            try {
                userRepository.save(user);
                Standard standard = new Standard(true,user);
                return new ResponseEntity(standard, HttpStatus.OK);

            }catch (Exception exception){

                Standard standard = new Standard(false,exception.getMessage());
                return new ResponseEntity(standard,HttpStatus.BAD_REQUEST);
            }
        }
    */
    public ResponseEntity save(User user) {

        Optional<User> optionalCustomer = userRepository.findByEmailEqualsIgnoreCase(user.getEmail());
        if (optionalCustomer.isPresent()) {
            return null;
        } else {
            try {
                String newPassword = passwordEncoder.encode(user.getPassword());
                user.setPassword(newPassword);
                userRepository.save(user);
                Standard standard = new Standard(true, user);
                return new ResponseEntity(standard, HttpStatus.OK);

            } catch (Exception exception) {

                Standard standard = new Standard(false, exception.getMessage());
                return new ResponseEntity(standard, HttpStatus.BAD_REQUEST);
            }

        }
    }

    public String userUsername() {
        User user = new User();
        try {
            String username = user.getEmail();
            return username;

        } catch (Exception exception) {
            return "";
        }
    }

    public String userPass() {
        User user = new User();
        try {
            String pass = user.getPassword();
            return pass;

        } catch (Exception exception) {
            return "";        }
    }
}

package com.service;


import com.configs.Standard;
import com.entities.UserEntitiy;
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
    public ResponseEntity save(UserEntitiy userEntitiy) {

        Optional<UserEntitiy> optionalCustomer = userRepository.findByEmailEqualsIgnoreCase(userEntitiy.getEmail());
        if (optionalCustomer.isPresent()) {
            return null;
        } else {
            try {
                String newPassword = passwordEncoder.encode(userEntitiy.getPassword());
                userEntitiy.setPassword(newPassword);
                userRepository.save(userEntitiy);
                Standard standard = new Standard(true, userEntitiy);
                return new ResponseEntity(standard, HttpStatus.OK);

            } catch (Exception exception) {

                Standard standard = new Standard(false, exception.getMessage());
                return new ResponseEntity(standard, HttpStatus.BAD_REQUEST);
            }

        }
    }
    public ResponseEntity login(UserEntitiy userEntitiy){
        Optional<UserEntitiy> optionalUser = userRepository.findByEmailEqualsIgnoreCaseAndPasswordEquals(userEntitiy.getEmail(), userEntitiy.getPassword());
        if (optionalUser.isPresent()){
            return new ResponseEntity(optionalUser.get(),HttpStatus.OK);
        }else{
            return new ResponseEntity("Mail - Password !",HttpStatus.BAD_REQUEST);
        }
    }

    public UserEntitiy update (UserEntitiy userEntitiy){
        Optional<UserEntitiy> optionalUser = userRepository.findById(userEntitiy.getUid());
        if (optionalUser.isPresent()){
            userRepository.saveAndFlush(userEntitiy);
            return userEntitiy;
        }
        return null;
    }
    public  boolean delete(Long uid){
        try {
            userRepository.deleteById(uid);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

}

package com.service;


import com.configs.Standard;
import com.entities.Role;
import com.entities.User;
import com.entities.projection.IUser;
import com.repositories.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    final PasswordEncoder passwordEncoder;
    final UserRepository userRepository;



    public ResponseEntity register(User user) {
        try {
            if (userRepository.existsByEmailEqualsIgnoreCase(user.getEmail())) {
                Standard rest = new Standard(false, "This account already exists!");
                return new ResponseEntity(rest, HttpStatus.BAD_REQUEST);
            } else {
                String newPassword = passwordEncoder.encode(user.getPassword());
                user.setPassword(newPassword);
                userRepository.save(user);
                Standard rest = new Standard(true, user);
                return new ResponseEntity(rest, HttpStatus.OK);
            }

        } catch (Exception ex) {
            Standard rest = new Standard(false, ex.getMessage());
            return new ResponseEntity<>(rest, HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity save(User user){
        try{
            Optional<User> optionalUser = userRepository.findByEmailEqualsIgnoreCase(user.getEmail());
            if(optionalUser.isPresent()){
                Standard rest = new Standard(false,"User Already Exists");
                return new ResponseEntity(rest,HttpStatus.BAD_REQUEST);
            }else{
                String newPassword = passwordEncoder.encode(user.getPassword());
                user.setPassword(newPassword);
                userRepository.save(user);
                Standard rest = new Standard(true,user);
                return new ResponseEntity(rest,HttpStatus.OK);
            }
        }catch (Exception ex){
            Standard rest = new Standard(false,ex.getMessage());
            return new ResponseEntity(rest, HttpStatus.BAD_REQUEST);
        }

    }

    public ResponseEntity login(User userEntitiy){
        IUser optionalUser = userRepository.user(userEntitiy.getEmail(), userEntitiy.getPassword());
        List<User> userList = userRepository.findAll();
        for (User user: userList) {
            if (user.getEmail().equals(userEntitiy.getEmail()) && passwordEncoder.matches(userEntitiy.getPassword(), user.getPassword())) {
                IUser user1 = userRepository.user(user.getEmail(), user.getPassword());
                return new ResponseEntity(user1, HttpStatus.OK);
            }
            else{
                return new ResponseEntity("12314512312",HttpStatus.BAD_REQUEST);
            }
        }
            return null;

    }

    public User update (User user){
        Optional<User> optionalUser = userRepository.findById(user.getUid());
        if (optionalUser.isPresent()){
            userRepository.saveAndFlush(user);
            return user;
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



    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByEmailEqualsIgnoreCase(username);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),parseRole(user.getRole()));
        }
        throw new UsernameNotFoundException("Not Found");
    }

    private Collection<? extends GrantedAuthority> parseRole(List<Role> roles) {
        List<GrantedAuthority> ls = new ArrayList<>();
        for(Role item : roles){
            ls.add(new SimpleGrantedAuthority(item.getName()));
        }
        return ls;
    }


}

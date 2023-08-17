package com.Controller;



import com.entities.User;
import com.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid User user){
       return userService.save(user);
    }

    @GetMapping("/login")
    public ResponseEntity login(@RequestBody User user){
        return userService.login(user);
    }

    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable Long uid){
        return userService.delete(uid);
    }

    @PostMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }

}

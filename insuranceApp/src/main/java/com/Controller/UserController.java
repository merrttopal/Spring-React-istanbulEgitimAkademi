package com.Controller;



import com.entities.UserEntitiy;
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
    public ResponseEntity register(@RequestBody @Valid UserEntitiy userEntitiy){
       return userService.save(userEntitiy);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserEntitiy userEntitiy){
        return userService.login(userEntitiy);
    }

    @GetMapping("/delete/{uid}")
    public boolean delete(@PathVariable Long uid){
        return userService.delete(uid);
    }

    @PostMapping("/update")
    public UserEntitiy update(@RequestBody UserEntitiy userEntitiy){
        return userService.update(userEntitiy);
    }

}

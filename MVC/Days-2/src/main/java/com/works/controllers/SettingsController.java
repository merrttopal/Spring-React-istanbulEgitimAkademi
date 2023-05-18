package com.works.controllers;

import com.works.props.Users;
import com.works.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SettingsController {

    final UserService userService;
    @GetMapping("/settings")
    public String settings(){
        return "settings";
    }

    @PostMapping("/userSave")
    public String userSave(Users user){
        int status = userService.saveUser(user);
        if(status > 0){
            return "redirect:/home";
        }
        return "settings";
    }
}
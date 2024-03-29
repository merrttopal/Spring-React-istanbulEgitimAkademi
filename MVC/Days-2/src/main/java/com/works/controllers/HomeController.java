package com.works.controllers;

import com.works.props.Users;
import com.works.services.TinkEncDec;
import com.works.services.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class HomeController {

    final  UserService service;
    int status = -1;
    String message = "";
    int uid = 0;

    @GetMapping("/home")
    public String home(Model model, @RequestParam(defaultValue = "1") int p) {
        model.addAttribute("users", service.users(p));
        model.addAttribute("status", status);
        model.addAttribute("message", message);
        model.addAttribute("uid", uid);
        int count = service.totalCount();
        model.addAttribute("count",count);
        int page = 0;
        page = count%50 == 0 ? count/50 : (count/50)+1;
        model.addAttribute("page",page);
        model.addAttribute("p",p);

        status = -1;
        message = "";
        uid = 0;



        return "home";
    }

    @GetMapping("/userInfo/{uid}")
    public String userInfo(@PathVariable int uid, Model model){
        Users u = service.showUser(uid);
        model.addAttribute("user",u);
        return "userInfo";
    }


    @GetMapping("/userDelete/{uid}")
    public String userDelete(@PathVariable int uid) {
        status = service.deleteUser(uid, 0);
        if (status > 0) {
            message = "Delete Success - " + uid;
            this.uid = uid;
        }else {
            message = "Delete Fail - " + uid;
        }
        return "redirect:/home";
    }
    @GetMapping("/userBack/{uid}")
    public String userBack(@PathVariable int uid) {
        Users users = new Users();
        service.deleteUser(uid, 1);
        service.showUser(uid);
        return "redirect:/home";
    }

    @PostMapping("/userUpdate")
    public String userUpdate(Users user){
        service.updateUser(user);
        return "redirect:/home";
    }


}

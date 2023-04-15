package com.works.controllers;

import com.works.props.Address;
import com.works.props.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title","Site Title");
        model.addAttribute("name","Mert");
        model.addAttribute("surname","Topal");
        model.addAttribute("email","merrt.topal@gmail.com");
        model.addAttribute("user", singleUser());
        model.addAttribute("users",users());
        return "home";
    }


    private User singleUser(){
        User user = new User();
        user.setUid(1);
        user.setName("Mert");
        user.setSurname("Topal");
        Address address = new Address();
        address.setAid(11);
        address.setDetail("Kadıköy / İstanbul / Türkiye");
        user.setAddress(address);
        return user;
    }

    private List<User> users(){
        List<User> ls = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            User u = new User();
            u.setUid(new Random().nextInt(1000));
            u.setName("name"+i);
            u.setSurname("surname"+i);

            Address address = new Address();
            address.setAid((new Random().nextInt(1000)));
            address.setDetail("Türkiye"+" "+new Random().nextInt(81));
            u.setAddress(address);
            ls.add(u);

        }
        return ls;
    }

}

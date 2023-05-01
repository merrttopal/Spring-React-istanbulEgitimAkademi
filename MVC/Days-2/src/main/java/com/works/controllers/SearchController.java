package com.works.controllers;

import com.works.props.Users;
import com.works.services.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    SearchService service = new SearchService();
    int status = -1;
    String message = "";
    int uid = 0;
    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "") String q, Model model){
        List<Users> ls = service.searchlist(q);
        model.addAttribute("users",service.searchlist(q));
        model.addAttribute("data", q );
        return "search";}




}

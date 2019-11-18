package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/hello")
    public String index(Model model){
        model.addAttribute("title","LOL");
        model.addAttribute("msg","hello");

        return "index";
    }

}

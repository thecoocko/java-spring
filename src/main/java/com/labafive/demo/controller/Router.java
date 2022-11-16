package com.labafive.demo.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Router {
    @RequestMapping("/index")
    String index(){
        return "index";
    }
    @RequestMapping("/home")
    String home(@RequestParam String name,Model model, HttpServletRequest request){
        model.addAttribute("guest_name",name);
        return "home";
    }
    @RequestMapping("/about")
    String about(){
        return "about";
    }

}

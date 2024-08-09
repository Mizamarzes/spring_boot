package com.breakline.farmville.farmville.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/","/home"})
    public String home() {
        return "redirect:/form";
    }
    
}

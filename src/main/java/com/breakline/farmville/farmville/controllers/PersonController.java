package com.breakline.farmville.farmville.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping("/person")
    public String person() {
        return "person"; // This corresponds to person.html
    }
}

package com.breakline.farmville.farmville.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.breakline.farmville.farmville.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Juan", "Contreras", "monda@gmail.com");
        model.addAttribute("title", "Holaa desde backend!");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = new ArrayList<>();
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return "list";
    }

}

package com.breakline.farmville.farmville.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.breakline.farmville.farmville.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Juan Diego", "Contreras", "mizamarzes@gmail.com");
        model.addAttribute("title", "myPage");
        model.addAttribute("userModel", user);
        return "details";
    }    

    @GetMapping("/listdetails")
    public String listdetails(ModelMap model){
        List<User> users = Arrays.asList(
            new User("Carlos", "Perez", "email@gmail.com"),
            new User("Martha","Sanchez", "email@gmail.com"),
            new User("Vicente","Camargo", "email@gmail.com")
        );
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return "listdetails";
    }

    // @GetMapping("/listdestails")
    // public String list(ModelMap model){
    //     model.addAttribute("title", "Listado de Usuarios");
    //     model.addAttribute("users", "users");
    //     return "list";
    // }

    // @ModelAttribute("users")
    // public List<User> usersModel() {
    //     List<User> users = Arrays.asList(
    //         new User("Pepa", "Gonzalez", "pepaG@gmail.com"),
    //         new User("Lalo", "Perez", "lalo@correo.com"),
    //         new User("Juanita", "Roe", "juana@correo.com"),
    //         new User("Andres", "Doe", "andres@gmail.com")
    //     );
    //     return users;
    // }

        
        

}

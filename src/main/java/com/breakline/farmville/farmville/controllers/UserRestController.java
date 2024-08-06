package com.breakline.farmville.farmville.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.breakline.farmville.farmville.models.User;
import com.breakline.farmville.farmville.models.dto.UserDto;

@RestController
@RequestMapping("/v2/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Juan", "Contreras", "monda");
        userDto.setTitle("mondaco");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(ModelMap model){
        List<User> users = Arrays.asList(
            new User("Carlos", "Perez", "a1@gmail.com"),
            new User("Martha","Sanchez", "a2@gmail.com"),
            new User("Vicente","Camargo", "a3@gmail.com")
        );
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return users;
    }

    // @GetMapping("/details")
    // public Map<String,Object> details(){
    //     User user = new User("Juan", "Contreras");
    //     Map<String,Object> body = new HashMap<>();
    //     body.put("title", "Pruebas SpringBoot");
    //     body.put("user", user);
    //     return body;
    // }
}

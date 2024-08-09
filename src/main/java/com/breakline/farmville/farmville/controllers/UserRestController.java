package com.breakline.farmville.farmville.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.breakline.farmville.farmville.models.User;
import com.breakline.farmville.farmville.models.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        User user = new User("Juan", "Diego", "mizamarzes@gmail.com");
        UserDto userDto = new UserDto();
        userDto.setTitle("Ingeniero");
        userDto.setUser(user);
        // Map<String,Object> body = new HashMap<>();
        // body.put("nombre", user.getNombre());
        // body.put("apellido", user.getApellido());
        return userDto;
    }

    @GetMapping("/listdetails")
    public List<User> listdetails(){
        User user0 = new User("juanDiego", "contreras", "mizamarzes@gmail.com");
        User user1 = new User("luciana", "melendez", "jc@gmail.com");
        User user2 = new User("mayra", "luna", "mayra@gmail.com");
        List<User> lstUsers = Arrays.asList(user0, user1, user2);
        return lstUsers;
    }

    // @GetMapping("/list")
    // public List<User> list(ModelMap model){
    //     List<User> users = Arrays.asList(
    //         new User("Carlos", "Perez", "a1@gmail.com"),
    //         new User("Martha","Sanchez", "a2@gmail.com"),
    //         new User("Vicente","Camargo", "a3@gmail.com")
    //     );
    //     model.addAttribute("title", "Listado de Usuarios");
    //     model.addAttribute("users", users);
    //     return users;
    // }

    // @GetMapping("/details")
    // public Map<String,Object> details(){
    //     User user = new User("Juan", "Contreras");
    //     Map<String,Object> body = new HashMap<>();
    //     body.put("title", "Pruebas SpringBoot");
    //     body.put("user", user);
    //     return body;
    // }
}

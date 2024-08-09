package com.breakline.farmville.farmville.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.breakline.farmville.farmville.models.User;
import com.breakline.farmville.farmville.models.dto.ParamsDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamsDto foot(@RequestParam(required = false, defaultValue = "Hola Mundo") String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamsDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamsDto params = new ParamsDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

    @GetMapping("/request")
    public ParamsDto request(HttpServletRequest request) {
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
        // TODO: handle exception
        }
        ParamsDto params = new ParamsDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }

    @PostMapping("/createproduct")
    public User createproduct(@RequestBody User user){
        return user;
    }

}

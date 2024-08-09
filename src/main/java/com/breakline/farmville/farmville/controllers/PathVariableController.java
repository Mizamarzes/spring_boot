package com.breakline.farmville.farmville.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // ----------------------------

    @Value("${app.name}")
    private String name;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
    @Value("${app.listaroles}")
    private List<String> lstroles;
    @Value("${app.message}")
    private String message;
    @Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
    @Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
    private List<String> customlstrolesMayuscula;

    @Value("#{${app.inventory}}")
    private Map<String,Object> inventory;
    @Value("#{${app.inventory}.product}")
    private String producName;
    @Value("#{T(java.lang.Integer).parseInt(${app.inventory}['price']) *T(java.lang.Integer).parseInt(${app.inventory}['stock'])}")
    private Long totalInv;

    @Autowired
    private Environment env;

    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version", version);
        json.put("listwords", listwords);
        json.put("lstroles", lstroles);
        json.put("clstroles", customlstroles);
        json.put("clstrolesMayus", customlstrolesMayuscula);
        json.put("inventory", inventory);
        json.put("valor", totalInv);
        json.put("message", message);
        json.put("message2",env.getProperty("app.message"));
        String data = env.getProperty("app.inventory");
        JSONObject jsonObject = new JSONObject(data);
        json.put("price2",jsonObject.getLong("price"));
        return json;
    }
}

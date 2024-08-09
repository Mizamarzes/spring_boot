package com.breakline.farmville.farmville.controllers;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Configuration
@RestController
@PropertySources({
	@PropertySource(value="classpath:values.properties",encoding = "UTF-8")
})
public class ValuesConfig {

    
}

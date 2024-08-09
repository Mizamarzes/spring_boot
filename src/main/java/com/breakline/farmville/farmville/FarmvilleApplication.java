package com.breakline.farmville.farmville;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FarmvilleApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(
			FarmvilleApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
		app.run(args);
		//SpringApplication.run(FarmvilleApplication.class, args);
	}

	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200", "http://localhost", 
				"http://localhost:8080").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}

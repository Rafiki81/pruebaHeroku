package com.rafiki.pruebaHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaHerokuApplication {

	@GetMapping("/")
	public String sayHi(){
		return "Welcome to heroku Cloud Solutions";
	}

	@GetMapping("/{input}")
	public String getMessage(@PathVariable String input){
		return "Welcome " + input;
	}

	public static void main(String[] args) {
		SpringApplication.run(PruebaHerokuApplication.class, args);
	}

}

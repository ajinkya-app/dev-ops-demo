package com.example.firstdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {

	
	@GetMapping("/hello")
	public String get() {

		return "Hello All !! This is First Docker image project !!!!";
	}

	
	@GetMapping("/hello/{name}")
	public String getMsg(@PathVariable("name") String name) {

		return "Hello "+ name +" This is First Docker image project !!!!";
	}

}

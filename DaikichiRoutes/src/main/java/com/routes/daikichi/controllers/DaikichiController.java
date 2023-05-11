package com.routes.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome!!!";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find Luck!!!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise!";
	}
	
	//Daikichi Path Variables Routes
	
	@RequestMapping("/travel/{location}")
	public String location(@PathVariable String location) {
		return "You will travel to " + location;
	}
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable int num) {
		if(num % 2 == 0) {
			return "You will thake a grand journey!";
		}
		else {
			return "You have enjoyed the fruits of your labor!";
		}
	}
}

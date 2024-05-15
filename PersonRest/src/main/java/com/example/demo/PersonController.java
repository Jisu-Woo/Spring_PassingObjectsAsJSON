package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//already @ResponseBody
@RestController
public class PersonController {
	
	//loosely coupled wiring
	@Autowired
	private IPersonManager manager;
	
	@GetMapping(value="/random", produces="application/json")
	public Person randomPerson() {
		return manager.getRandomPerson();
	}
	
	@PostMapping(value="/add", consumes = "application/json")
	public String addPerson(@RequestBody Person p) {
		System.out.println("Received a person: "+p.getName());
		return ""+manager.addPerson(p); // boolean converts to String by ""
	}
}

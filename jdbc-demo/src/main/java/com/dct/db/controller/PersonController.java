package com.dct.db.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dct.db.model.Person;
import com.dct.db.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@GetMapping("/person")
	public List<Person> get(){
		
		/*Person p1 = new Person(1, "gurpreet", "india");
		List l = new ArrayList<>();
		
		l.add(p1);
		return l;*/
		return personService.get();
	}
	
}

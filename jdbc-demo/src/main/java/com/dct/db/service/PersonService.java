package com.dct.db.service;

import java.util.List;

import com.dct.db.model.Person;

public interface PersonService {

	
    List<Person> get();
	
    Person get(int id);
	
	void save(Person person);
	
	void delete(int id); 
	
}

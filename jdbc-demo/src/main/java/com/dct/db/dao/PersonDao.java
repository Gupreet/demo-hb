package com.dct.db.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dct.db.model.Person;


public interface PersonDao {
    List<Person> get();
	
    Person get(int id);
	
	void save(Person person);
	
	void delete(int id);
}

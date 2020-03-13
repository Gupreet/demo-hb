package com.dct.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dct.db.dao.PersonDao;
import com.dct.db.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	
	@Autowired
	private PersonDao personDao;
	
	@Override
	public List<Person> get() {
		return personDao.get();
	}

	@Override
	public Person get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}

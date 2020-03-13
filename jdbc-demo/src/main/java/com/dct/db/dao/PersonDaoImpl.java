package com.dct.db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dct.db.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public List<Person> get() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria c =session.createCriteria(Person.class);
		c.add(Restrictions.like("name", "gurpre%"));
		List<Person>  personList=c.list();
		
		/*List<Person>  personList = session.createQuery("from Person", Person.class).getResultList();*/
		return personList;
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

/*
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public List<Person> get() {
		SessionFactory sessionFactory =entityManagerFactory.unwrap(SessionFactory.class);
		Session session = sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person",Person.class).list();
		return personsList;
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
		
	}*/

}

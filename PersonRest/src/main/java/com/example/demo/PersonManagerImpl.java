package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

//backend service component
@Service
public class PersonManagerImpl implements IPersonManager{
	
	// database of persons
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	// initialize database with mock data
	// PostConstruct runs after the bean has been created
	@PostConstruct
	private void init() {
		persons.add(new Person("Jisu Woo", 22, "Running", "Media"));
		persons.add(new Person("Jisoo Woo", 21, "Swimming", "SW"));

	}
	@Override
	public boolean addPerson(Person p) {
		// person null check & isAlreadyThere check
		if(p != null && persons.indexOf(p) == -1) {
			persons.add(p);
			return true;
		}
		return false;
	}

	@Override
	public Person getRandomPerson() {
		if(persons.size() == 0)
			return null;
		return persons.get((int)(Math.random() * persons.size()));
	}
	

}

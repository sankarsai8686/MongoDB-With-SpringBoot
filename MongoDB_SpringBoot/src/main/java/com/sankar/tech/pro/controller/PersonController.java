package com.sankar.tech.pro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sankar.tech.pro.model.Person;
import com.sankar.tech.pro.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Person savePerson(@RequestBody Person person)
	{
		Person savedPerson = personRepository.save(person);
		return savedPerson;
	}
	
	@GetMapping
	public List<Person> getAllPersons()
	{
		return personRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Person getById(@PathVariable(name = "id") Integer id)
	{
		Optional<Person> findById = personRepository.findById(id);
		return findById.get();
	}
	
	
	
	@PutMapping("/{id}")
	public Person updatePerson(@RequestBody Person person,@PathVariable(name = "id") Integer id)
	{
		person.setId(id);
		return personRepository.save(person);
	}
	
	
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable(name = "id") Integer id)
	{
		personRepository.deleteById(id);
		return "Deleted person with id :"+id;	}
	
	
	
	
	
	

}

package com.sankar.tech.pro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sankar.tech.pro.model.Person;

public interface PersonRepository extends MongoRepository<Person, Integer>{

}

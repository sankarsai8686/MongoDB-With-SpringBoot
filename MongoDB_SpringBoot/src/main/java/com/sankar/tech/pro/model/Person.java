package com.sankar.tech.pro.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString

@Document(collection = "Person")
public class Person {
	
	@Id
	private int id;
	private String name;
	private int age;

}

package com.sankar.tech.pro.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data

@Document(collection = "vehicle")
public class Vehicle {

	private int id;
	private String brand;
	
	
}

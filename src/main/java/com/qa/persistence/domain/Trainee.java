package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long traineeID;
	String traineeName;
	
	
	public Trainee() {

	}

	public Trainee(String traineename) {
		traineeName = traineename;

	}

	public String setTraineeName(String name) {
		traineeName = name;
		return "Name Changed";
	}

}

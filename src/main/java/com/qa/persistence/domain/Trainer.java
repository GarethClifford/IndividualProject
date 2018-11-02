package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long trainerID;
	String trainerName;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "traineeID")
	List<String> trainees = new ArrayList<>();


	public Trainer() {

	}

	public Trainer(String trainername) {
		trainerName = trainername;

	}

	public String setTrainerName(String name) {
		trainerName = name;
		return "Name Changed";
	}
	
//	public String setAccountNumber(String accountno) {
//		accountNumber = accountno;
//		return "Name Changed";
//	}

	public String getTrainerName() {
		return trainerName;
	}
//	public String getLastName() {
//		return lastName;
//	}
//
//	public String getAccountNumber() {
//		return accountNumber;
//	}
	public Long getIDNumber() {
		return this.trainerID;
	}

//	public String getName() {
//
//		return firstName + " " + lastName;
//	}

}

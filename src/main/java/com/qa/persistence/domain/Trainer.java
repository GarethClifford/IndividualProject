package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomID;
	private String trainer;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "classroomID")
//	HashMap<Long,String> traineeHash = new HashMap<>();
	private List<Trainee> trainee;

	public Trainer() {

	}

	public Trainer(String trainer, Trainee trainee) {
		this.trainer= trainer;
		this.trainee = (List<Trainee>) trainee;
	}
	
	public Long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Long classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Trainee getTrainee() {
		return (Trainee) trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = (List<Trainee>) trainee;
	}


}

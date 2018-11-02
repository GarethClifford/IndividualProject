package com.qa.service.business;

import com.qa.persistence.domain.Trainee;
import com.qa.persistence.domain.Trainer;

public interface IClassService {

	Trainer findATrainer(Long trainerid);

	Trainee findATrainee(Long traineeid);

	String createTrainer(String trainer);

	String createTrainee(String trainee);

	String getAll();

	String deleteTrainer(Long id);

	String deleteTrainee(Long traineeid);

	String updateTrainer(Long trainerid, String trainers);

	String updateTrainee(Long traineeid, String trainees);

}
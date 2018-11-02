package com.qa.persistence.repository;

import com.qa.persistence.domain.Trainee;
import com.qa.persistence.domain.Trainer;

public interface IConnect {

	String createTrainee(String trainee);

	String createTrainer(String trainer);

	Trainer findATrainer(Long id);

	Trainee findATrainee(Long id);

	String updateTrainer(String trainer, Long id);

	String updateTrainee(String trainee, Long id);

	String deleteTrainer(Long id);

	String deleteTrainee(Long id);

	String getAll();

}
package com.qa.persistence.repository;
import static javax.transaction.Transactional.TxType.*;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;


import com.qa.persistence.domain.Trainee;
import com.qa.persistence.domain.Trainer;
import com.qa.util.JSONUtil;

public class ClassroomDBRepo implements IConnect {
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	@Inject
	private JSONUtil util;

	@Override
	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee trainees = util.getObjectforJSON(trainee, Trainee.class);
		em.persist(trainees);
		return "{\"message\": \"Trainee sucessfully added\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String createTrainer(String trainer) {
		Trainer trainers = util.getObjectforJSON(trainer, Trainer.class);
		em.persist(trainers);
		return "{\"message\": \"Trainer sucessfully added\"}";
	}

	@Override
	public Trainer findATrainer(Long id) {
		return em.find(Trainer.class, id);
	}

	@Override
	public Trainee findATrainee(Long id) {
		return em.find(Trainee.class, id);
	}

	@Override
	@Transactional(REQUIRED)
	public String updateTrainer(String trainer, Long id) {
		Trainer newDetails = util.getObjectforJSON(trainer, Trainer.class);
		Trainer oldDetails = em.find(Trainer.class, id);
		oldDetails.setTrainer(newDetails.getTrainer());
		return "{\"message\": \"Trainer sucessfully updated\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateTrainee(String trainee, Long id) {
		Trainee newDetails = util.getObjectforJSON(trainee, Trainee.class);
		Trainee oldDetails = em.find(Trainee.class, id);
		oldDetails.setTraineeName(newDetails.getTraineeName());
		return "{\"message\": \"Trainee sucessfully updated\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteTrainer(Long id) {
		em.remove(findATrainer(id));
		return "{\"message\": \"account sucessfully removed\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		em.remove(findATrainee(id));
		return "{\"message\": \"account sucessfully removed\"}";
	}

	public String getAll() {
		Query query = em.createQuery("SELECT t FROM Trainer t");
		Collection<Trainer> trainers = (Collection<Trainer>)query.getResultList();
		return util.getJSONForObject(query.getResultList());
	}


}

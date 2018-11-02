//package com.qa.persistence.repository;
//
//import static javax.transaction.Transactional.TxType.REQUIRED;
//
//import java.util.HashMap;
//
//import javax.enterprise.inject.Alternative;
//import javax.faces.bean.ApplicationScoped;
//import javax.inject.Inject;
//import javax.transaction.Transactional;
//
//import com.qa.persistence.domain.Trainee;
//import com.qa.persistence.domain.Trainer;
//import com.qa.util.JSONUtil;
//
//@ApplicationScoped
//@Alternative
//public class ClassroomMapRepo {
//	@Inject
//	private JSONUtil util;
//	HashMap<Long,String> classMap = new HashMap<Long,String>();
//	
//	public String getTrainer() {
//		return classMap.values().toString();
//	}
//	public String getTrainee() {
//		return classMap.values().toString();
//	}
//	public String findTrainer(Long trainerid) {
//		return classMap.get(trainerid);
//	}
//	public String findTrainee(Long traineeid) {
//		return classMap.get(traineeid);
//	}
//	
//	@Transactional(REQUIRED)
//	public String createTrainer(String trainer) {
//		Trainer trainers = util.getObjectforJSON(trainer, Trainer.class);
//		classMap.put(trainer);
//		return "{\"message\": \"Trainer sucessfully added\"}";
//	}
//	
//	@Transactional(REQUIRED)
//	public String createTrainee(String trainee) {
//		Trainer trainees = util.getObjectforJSON(trainees, Trainee.class);
//		classmap.put(account);
//		return "{\"message\": \"Trainee sucessfully added\"}";
//	}
//	
//
//}

package com.qa.service.business;

import javax.inject.Inject;

import com.qa.persistence.domain.Trainee;
import com.qa.persistence.domain.Trainer;
import com.qa.persistence.repository.IConnect;

public class ClassService implements IClassService {
	
	@Inject
	private IConnect connect;
	
	/* (non-Javadoc)
	 * @see com.qa.service.business.IClassService#findATrainer(java.lang.Long)
	 */
	@Override
	public Trainer findATrainer(Long trainerid) {
		return connect.findATrainer(trainerid);
	}

	/* (non-Javadoc)
	 * @see com.qa.service.business.IClassService#findATrainee(java.lang.Long)
	 */
	@Override
	public Trainee findATrainee(Long traineeid) {
		return connect.findATrainee(traineeid);
	}

	/* (non-Javadoc)
	 * @see com.qa.service.business.IClassService#createTrainer(java.lang.String)
	 */
	@Override
	public String createTrainer(String trainer) {
		return connect.createTrainer(trainer);
	}
	/* (non-Javadoc)
	 * @see com.qa.service.business.IClassService#createTrainee(java.lang.String)
	 */
	@Override
	public String createTrainee(String trainee) {
		return connect.createTrainee(trainee);
	}
	/* (non-Javadoc)
	 * @see com.qa.service.business.IClassService#getAll()
	 */
	@Override
	public String getAll() {
		return connect.getAll();
				
	}
	
	public String deleteTrainer(Long trainerid) {
		return connect.deleteTrainer(trainerid);
	}
	public String deleteTrainee(Long traineeid) {
		return connect.deleteTrainee(traineeid);
	}
	public String updateTrainer(Long trainerid, String trainers) {
		return connect.updateTrainer(trainers, trainerid);
				
	}
	public String updateTrainee(Long traineeid, String trainees) {
		return connect.updateTrainee(trainees, traineeid);
				
	}
	
}

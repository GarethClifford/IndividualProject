package com.qa.rest;

import javax.inject.Inject;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.service.business.IClassService;

@Path("/classroom")
public class ClassEndPoint {

	@Inject
	private IClassService service;

	@Path("/getAll")
	@GET
	@Produces({ "application/json" })
	public String getAll() {
		return service.getAll();
	}
	
	@Path("/createTrainer")
	@POST
	@Produces({ "application/json" })
	public String createTrainer(String trainer) {
		return service.createTrainer(trainer);
	}
	@Path("/createTrainee")
	@POST
	@Produces({ "application/json" })
	public String createTrainee(String trainee) {
		return service.createTrainee(trainee);
	}
	
	@Path("/deleteTrainer/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainer(@PathParam("id") Long trainerid) {
		return service.deleteTrainer(trainerid);
	}
	@Path("/deleteTrainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") Long traineeid) {
		return service.deleteTrainee(traineeid);
	}
	@Path("/updatetrainer/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateTrainer(@PathParam("id") Long trainerid, String trainers) {
		return service.updateTrainer(trainerid, trainers);
	}
	@Path("/updatetrainee/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateTrainee(@PathParam("id") Long traineeid, String trainees) {
		return service.updateTrainee(traineeid, trainees);
	}

	
	public void setService(IClassService service) {
		this.service = service;
	}
}

package com.javaeplanet.clinicals.service;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.javaeplanet.clinicals.model.Patient;
import com.javaeplanet.clinicals.repos.PatientRepository;

@Produces("application/json")
@Consumes("application/json")
@Path("/api")
public class PatientService {
	@Autowired
	 PatientRepository repos;

	@Path("/patients")
	@POST
	public Patient createPatient(Patient patient) {
		return repos.save(patient);
	}

	@Path("/patients/{id}")
	@GET
	public Patient getPatient(@PathParam("id") int id) {
		return repos.findById(id).get();
	}
	
	@GET
	@Path("/patients ")
	public List<Patient> getPatients(){
		return repos.findAll();
	}

}

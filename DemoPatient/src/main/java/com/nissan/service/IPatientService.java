package com.nissan.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.nissan.model.Patient;


public interface IPatientService {
	//list of all Employees
	
		List<Patient> listAllPatients();
		//get a single Employee by Id
		Optional<Patient> searchById(Integer _id);
		//Add a new Employee
		Patient addPatient(Patient patient);
		//Delete an employee
		void deletePatient(Integer _PatientId);
		//update an employee
		Patient updatePatient(Patient patient,Integer _PatientId);
		
}

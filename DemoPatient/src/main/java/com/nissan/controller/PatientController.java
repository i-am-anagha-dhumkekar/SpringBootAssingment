package com.nissan.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nissan.model.Patient;

import com.nissan.service.IPatientService;

@RestController
@RequestMapping("api/")
public class PatientController {
	@Autowired
	IPatientService patientService;
	//Get all list of Patients http://localhost:9091/api/patients
		@GetMapping("patients")
		public List<Patient> getAllPatients() {
			return patientService.listAllPatients();

		}
		/*@GetMapping("patients/{_patientId}")
		public Patient getEmployeeByPatientId(@PathVariable Integer _patientId) {
			return patientService.searchById(_patientId);
		}
		@PostMapping("patients")
		public Patient addPatient(@RequestBody Patient patient)
		{
			return patientService.addPatient(patient);
		}
		@PutMapping("patients/{patientId}")
		public Patient updatePatient(@RequestBody Patient patient,@PathVariable Integer _patientId)
		{
			return patientService.updatePatient(patient,_patientId);
		}*/
		@GetMapping("patients/{_id}")
		public Optional<Patient> searchById(@PathVariable Integer _id)
		{
			
			return patientService.searchById(_id);
			
		}
		@PostMapping("patients")
		public Patient addPatient(@RequestBody Patient patient)
		{
			return patientService.addPatient(patient);
		}
		@PutMapping("patients/{_id}")
		public Patient updatePatient(@RequestBody Patient _updatepatient,@PathVariable Integer _id)
		{
			return patientService.updatePatient(_updatepatient, _id);
		}
		@DeleteMapping("patients/{_id}")
		public void deletePatient(@PathVariable Integer _id) 
		{
			patientService.deletePatient(_id);
		}
}

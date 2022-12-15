package com.nissan.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.Patient;

public interface IPatientDAO extends JpaRepositoryImplementation<Patient, Integer> {

	@Query("from Patient where patientId=?1")
	public default Patient searchPatientId(Integer _patientId) {
		return null;
	
	}
	
}

package com.nissan.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.dao.IPatientDAO;

import com.nissan.model.Patient;

@Service
public class PatientServiceImplementation implements IPatientService {
	@Autowired
	IPatientDAO patientDAO;
	
	@Override
	public List<Patient> listAllPatients() {
		// TODO Auto-generated method stub
		return patientDAO.findAll();
	}
	@Override
	public Optional<Patient> searchById(Integer id) 
	{
		Optional<Patient> patient=patientDAO.findById(id);
		Patient p=patient.get();
		if(p!=null)
		{
			return patient;
		}
		else
		{
			return null; 
		}
		
        
    }

   @Override
    @Transactional
    public Patient addPatient(Patient patient) {
        return patientDAO.save(patient);
        
    }
   @Override
    public void deletePatient(Integer _id) {
       patientDAO.deleteById(_id);
       System.out.println("Patient data is deleted");
        
    }
@Override
public Patient updatePatient(Patient _updatepatient, Integer _id) {
	Patient patient = patientDAO.findById(_id).get();
    //patient.setPhoneNumber(_updatePatient.getMobNo());
    patient.setDob(_updatepatient.getDob());
    patient.setAddress(_updatepatient.getAddress());
      return patientDAO.save(patient);
	
}


	
}

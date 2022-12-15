package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.Professor;

public interface ProfessorService {
		//list of all Professors
		List<Professor> listAllProfessors();
		//get a single Employee by Id
	    Professor serachByProfessorId(Integer professorId);
		//Add a new Employee
		Professor addProfessor(Professor professor);
		//update a Employee details
		Professor updateProfessor(Professor professor,Integer professorId);
		//Delete an employee
		void deleteProfessor(Integer professorId);

}

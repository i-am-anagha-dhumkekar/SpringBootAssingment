package com.nissan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.ProfessorDAO;
import com.nissan.model.Professor;
@Service
public class ProfessorServiceImplementation implements ProfessorService{
	@Autowired
	ProfessorDAO professorDAO;
	@Override
	public List<Professor> listAllProfessors() {
		
		return professorDAO.findAll();
	}

	@Override
	public Professor addProfessor(Professor professor) {
		return professorDAO.save(professor);
	}

	@Override
	public Professor updateProfessor(Professor professor, Integer professorId) {
		Professor p=professorDAO.findById(professorId).get();
		p.setFirstName(professor.getFirstName());
		p.setManagerID(professor.getManagerID());
		p.setSalary(professor.getSalary());
		p.setDeptNo(professor.getDeptNo());
		p.setLastName(professor.getLastName());
		//return professorDAO.;
		return professorDAO.save(professor);
		
	}

	



	@Override
	public Professor serachByProfessorId(Integer professorId) {
		Professor p=professorDAO.findById(professorId).get();
		if(p!=null)
		{
			return p;
		}
		else
		{
			return null;
		}
	}



	@Override
	public void deleteProfessor(Integer professorId) {
		professorDAO.deleteById(professorId);
		
	}

}

package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Professor;
import com.nissan.service.ProfessorService;



@RestController
@RequestMapping("api/")
public class ProfessorController {
	@Autowired
	ProfessorService professorService;
	
	@GetMapping("professors")
	public List<Professor> getAllProfessors() {
		return professorService.listAllProfessors();

	}
	@GetMapping("professors/{id}")
	public Professor getProfessorById(@PathVariable Integer id)
	{
		return professorService.serachByProfessorId(id);
	}
	@PostMapping("professors")
	public Professor addProfessor(@RequestBody Professor professor)
	{
		return professorService.addProfessor(professor);
	}
	@PutMapping("professors/{id}")
	public Professor updateProfessor(@RequestBody Professor professor,@PathVariable Integer id)
	{
		return professorService.updateProfessor(professor, id);
		
	}
	@DeleteMapping("professors/{id}")
	public void deleteProfessor(@PathVariable Integer id)
	{
		professorService.deleteProfessor(id);
	}
}

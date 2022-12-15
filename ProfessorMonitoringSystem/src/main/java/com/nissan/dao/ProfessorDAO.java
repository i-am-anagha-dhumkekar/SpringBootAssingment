package com.nissan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.Professor;

public interface ProfessorDAO extends JpaRepositoryImplementation<Professor, Integer> {
	
}

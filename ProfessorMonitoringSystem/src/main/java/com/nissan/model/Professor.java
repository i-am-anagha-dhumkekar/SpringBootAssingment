package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="tblprofessor")
public class Professor {
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer professorId;
	@Column(nullable=false)
	private Integer managerID;
	private String firstName;
	private String lastName;
	@Column(nullable=false)
	//private Integer deptno;
	private Integer salary;
	private String joiningDate;
	private String  dateOfBirth;
	private String gender;
	private Integer deptNo;
	//Object -Oriented Class Model
	@JoinColumn(name="deptNo",insertable=false,updatable=false)
	@ManyToOne
	private Department department;
	//default constructor
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	
	//getters and setters
	public Integer getProfessorId() {
		return professorId;
	}
	public Professor(Integer professorId, Integer managerID, String firstName, String lastName, Integer salary,
			String joiningDate, String dateOfBirth, String gender, Department department) {
		super();
		this.professorId = professorId;
		this.managerID = managerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.department = department;
	}
	
	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}
	public Integer getManagerID() {
		return managerID;
	}
	public void setManagerID(Integer managerID) {
		this.managerID = managerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//to String
	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", managerID=" + managerID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", salary=" + salary + ", joiningDate="
				+ joiningDate + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender +", depatment id " +department.getDeptNo() "]";
	}
	
}

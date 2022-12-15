package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tblpatient")
public class Patient {
	//instance fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer patientId;
	@Column(nullable=false)
	private Integer regNo;
	private String patientName;
	private LocalDate dob;
	private String gender;
	private String address;
	@Column(nullable=false)
	private String mobNo;
	//default constructor
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Patient(Integer patientId, Integer regNo, String patientName, LocalDate dob, String gender, String address,
			String mobNo) {
		super();
		this.patientId = patientId;
		this.regNo = regNo;
		this.patientName = patientName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.mobNo = mobNo;
	}
	//getters and setters
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public Integer getRegNo() {
		return regNo;
	}
	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	//override toString
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", regNo=" + regNo + ", patientName=" + patientName + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", mobNo=" + mobNo + "]";
	}
	
}

package com.nissan.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="customer")
public class Customer {
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerNo;
	private String customerName;
	private String address;
	/*private List<Orders> orders;*/
	//default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Customer(Integer customerNo, String customerName, String address, List<Orders> orders) {
		super();
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.address = address;
		//this.orders = orders;
	}
	//getters and setters
	public Integer getCustomerNo() {
		return customerNo;
	}
	/*public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}*/
	public void setCustomerNo(Integer customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", customerName=" + customerName + ", address=" + address +"]";
	}
	
	
	
	
}

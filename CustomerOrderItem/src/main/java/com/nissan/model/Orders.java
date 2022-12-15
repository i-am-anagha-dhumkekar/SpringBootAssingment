package com.nissan.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="orders")
public class Orders {
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderNo;
	private LocalDateTime orderDate;
	private Integer customerId;
	@JoinColumn(name="customerId",insertable=false,updatable=false)
	@ManyToOne
	private Customer customer;
	/*
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<Items> items;*/
	//default constructor
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Orders(Integer orderNo, LocalDateTime orderDate, Integer customerId, Customer customer, List<Items> items) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.customer = customer;
		this.items = items;
	}
	//getters and setters
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	/*public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}*/
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	//to String
	@Override
	public String toString() {
		return "Orders [OrderNo=" + orderNo + ", OrderDate=" + orderDate + ", customerId=" + customerId + ", customer="
				+ customer + "]";
	}
	
	
	
	
	
}

package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="items")
public class Items {
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer itemId;
	private String itemName;
	private Integer quantity;
	private Integer orderNo;
	
	
	@JoinTable(name="orderNo")
	@ManyToOne
	private Orders orders;
	//default constructor
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Items(Integer itemId, String itemName, Integer quantity, Integer orderNo, Orders orders) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.orderNo = orderNo;
		this.orders = orders;
	}
	//getters and setters
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	//to string
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", orderNo=" + orderNo
				+ ", orders=" + orders + "]";
	}
	
}

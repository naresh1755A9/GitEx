package com.rs.fer.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Expense")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "expenseId")
	private int id;
	@Column(name = "expenseType", length = 10)
	private String expenseType;
	@Column(name = "date", length = 10)
	private String date;
	@Column(name = "price", length = 10)
	private float price;
	@Column(name = "numberofitems", length = 10)
	private int numberofitems;
	@Column(name = "total", length = 10)
	private float total;
	@Column(name = "bywhom", length = 10)
	private String bywhom;
	@Column(name = "userId", length = 10)
	private int userId;
    	
	@Column(name = "created", length = 10)
	private String created;
	@Column(name = "updated", length = 10)
	private String updated;

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expensetype) {
		this.expenseType = expensetype;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumberofitems() {
		return numberofitems;
	}

	public void setNumberofitems(int numberofitems) {
		this.numberofitems = numberofitems;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getBywhom() {
		return bywhom;
	}

	public void setBywhom(String bywhom) {
		this.bywhom = bywhom;
	}

}

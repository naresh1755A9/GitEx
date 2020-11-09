package com.rs.fer.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", length = 10)
	private int id;
	@Column(name = "line1", length = 30)
	private String line1;
	@Column(name = "line2", length = 30)
	private String line2;
	@Column(name = "city", length = 10)
	private String city;
	@Column(name = "state", length = 20)
	private String state;
	@Column(name = "postal", length = 10)
	private String postal;
	@Column(name = "country", length = 10)
	private String country;
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

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

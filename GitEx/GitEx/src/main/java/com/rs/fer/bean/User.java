package com.rs.fer.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	public Set<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}

	@Column(name = "firstname", length = 10)
	private String firstname;
	@Column(name = "middlename", length = 30)
	private String middlename;
	@Column(name = "lastname", length = 30)
	private String lastname;
	@Column(name = "email", length = 30)
	private String email;
	@Column(name = "mobile", length = 10)
	private String mobile;
	@Column(name = "username", length = 10)
	private String username;
	@Column(name = "password", length = 10)
	private String password;
	
	@Column(name = "created", length = 10)
	private String created;
	@Column(name = "updated", length = 10)
	private String updated;


	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private Address address;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Expense.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private Set<Expense> expenses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
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

}

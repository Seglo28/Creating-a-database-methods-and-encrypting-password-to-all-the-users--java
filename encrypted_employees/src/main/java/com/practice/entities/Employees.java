package com.practice.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {

	//This column is a student ID
	@Id
	//Adding columns SQL columns attributes
	@Column(name = "id", length = 30)		
	//When I save a student, going to generate an user id from this Java project. 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id = 0;
	//Adding SQL columns attributes
	@Column(name = "firtsName", length = 30, nullable = false)
	private String firtsName = "";
	//Adding SQL columns attributes
	@Column(name = "lastName", length = 30, nullable = false)
	private String lastName = "";
	//Adding SQL columns attributes
	@Column(name = "email", length = 30, nullable = false)
	private String email = "";
	//Adding SQL columns attributes
	@Column(name = "password", length = 250, nullable = false)
	private String password;
	
	//Constructors
	public Employees() {
		super();
	}

	public Employees(int id, String firtsName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	//Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "employees [id=" + id + ", firtsName=" + firtsName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + "]";
	}
	
}
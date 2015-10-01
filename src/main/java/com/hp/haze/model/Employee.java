package com.hp.haze.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private String email;
	private String fullName;
	private String managerEmail;
	private boolean isManager;

	public Employee() {

	}

	public Employee(String email, String fullName) {
		this.email = email;
		this.fullName = fullName;
	}

	public Employee(String email, String fullName, String managerEmail) {
		this.email = email;
		this.fullName = fullName;
		this.managerEmail = managerEmail;
	}

	@Id
	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "full_name", nullable = false, length = 255)
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "manager_email", nullable = true, length = 100)
	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
}

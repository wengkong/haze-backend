package com.hp.haze.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	private Long employeeId;
	private String email;	
	private String fullName;

	public Employee() {

	}

	public Employee(Long id, String email, String fullName) {
		this.email = email;
		this.fullName = fullName;
	}

	@Id
	@Column(name="employee_id", nullable=false)
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name="email", nullable=false, length=100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="full_name", nullable=false, length=255)
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}

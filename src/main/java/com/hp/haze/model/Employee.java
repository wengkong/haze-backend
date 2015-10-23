package com.hp.haze.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.Collection;

@Entity
@Table(name = "employees")
public class Employee {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String email;
	private String fullName;
	private String managerEmail;
	private int sumOfWorkedHours;
	private int sumOfCompTime;
	//private boolean isManager;

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
	@OneToMany(mappedBy="employees",targetEntity=CompTime.class,
    fetch=FetchType.EAGER)
    private Collection comptime; 
	@OneToMany(mappedBy="employees",targetEntity=Task.class,
		    fetch=FetchType.EAGER)
		    private Collection task; 
	
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
	
	/*public void setManager(boolean isManager) {
		this.isManager = isManager;
	}*/

	@Column(name = "sum_worked_hour", nullable = false, length = 11)
	public int getSumOfWorkedHours() {
		return sumOfWorkedHours;
	}

	public void setSumOfWorkedHours(int sumOfWorkedHours) {
		this.sumOfWorkedHours = sumOfWorkedHours;
	}
	
	@Column(name = "sum_ct_taken_hour", nullable = false, length = 11)
	public int getSumOfCompTime() {
		return sumOfCompTime;
	}

	public void setSumOfCompTime(int sumOfCompTime) {
		this.sumOfCompTime = sumOfCompTime;
	}
}

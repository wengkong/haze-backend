package com.hp.haze.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comptime")
public class CompTime {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String employeeEmail;
	private Date compTimeDate;
	private int compTimeHour;
	private boolean status;
	private int deleteFlag;

	public CompTime() {

	}

	@Id
	@Column(name = "ct_id", nullable = false, length = 11)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "employee_email", nullable = false, length = 100)
	@ManyToOne(optional=false)
    @JoinColumn(name="employee_email",referencedColumnName="email")
    private Employee employees;
	
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail (String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Column(name = "ct_date", nullable = false)
	public  Date getCompTimeDate() {
		return compTimeDate;
	}

	public void setCompTimeDate(Date compTimeDate) {
		this.compTimeDate = compTimeDate;
	}
	
	@Column(name = "ct_hour", nullable = false)
	public  int getCompTimeHour() {
		return compTimeHour;
	}

	public void setCompTimeHour(int compTimeHour) {
		this.compTimeHour = compTimeHour;
	}
	
	@Column (name = "rq_status", nullable = false)
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
		
	}
	
	@Column(name = "delete_flag", nullable = true)
	public  int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlaag(int deleteFLag) {
		this.deleteFlag = deleteFLag;
	}
	
}

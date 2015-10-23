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
@Table(name = "task")
public class Task {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String taskDescription;
	private String employeeEmail;
	private int projectID;
	private Date workedDate;
	private int workedHours;
	private boolean status;
	private String remark;
	private int deleteFlag;

	public Task() {

	}
	
	@Id
	@Column(name = "task_id", nullable = false, length = 11)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "task_desc", nullable = false, length = 100)
	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	@Column(name = "employee_email", nullable = false, length = 100)
	@ManyToOne(optional=false)
    @JoinColumn(name="employee_email",referencedColumnName="email")
    private Employee employees;
	
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Column(name = "project_id", nullable = false, length = 11)
	@ManyToOne(optional=false)
    @JoinColumn(name="project_id",referencedColumnName="project_id")
    private Employee project;
	
	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	@Column(name = "worked_date", nullable = false)
	public Date getWorkedDate() {
		return workedDate;
	}

	public void setWorkedDate(Date workedDate) {
		this.workedDate = workedDate;
	}

	@Column(name = "worked_hours", nullable = false, length = 11)
	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	@Column(name = "rq_status", nullable = false, length = 1)
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "remark", nullable = false, length = 200)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "delete_flag", nullable = true, length = 11)
	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
}

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
@Table(name = "project")
public class Project {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int projectid;
	private String projectName;
	private String projectDescription;

	public Project() {

	}

	@Id
	@Column(name = "project_id", nullable = false, length = 11)
	@OneToMany(mappedBy="project",targetEntity=Task.class,
    fetch=FetchType.EAGER)
    private Collection task; 
	
	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	

	@Column(name = "project_name", nullable = false, length = 100)
	public String getProjectname() {
		return projectName;
	}

	public void setProjectname(String projectName) {
		this.projectName = projectName;
	}

	@Column(name = "project_desc", nullable = false)
	public String getProjectDec() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
}

package com.demo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Project {

	public interface Properties
	{
		String ID = "id";
		String PROJECT_NAME = "projectName";
		String PROJECT_IDENTIFIER = "projectIdentifier";
		String DESCRIPTION = "description";
		String START_DATE = "startDate";
		String END_DATE = "endDate";
		String CREATED_ON = "createdOn";
		String UPDATED_ON = "updatedOn";
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = Properties.ID, unique = true, nullable = false)
	private Long id;
	private String projectName;
	private String projectIdentifier;
	private String description;
	private Date startDate;
	private Date endDate;
	private Date createdOn;
	private Date updatedOn;
	
	public Project()
	{
	}
	
//	@Column(name = Properties.ID)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	@Column(name = Properties.PROJECT_NAME)
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

//	@Column(name = Properties.PROJECT_IDENTIFIER)
	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

//	@Column(name = Properties.DESCRIPTION)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	@Column(name = Properties.START_DATE)
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

//	@Column(name = Properties.END_DATE)
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

//	@Column(name = Properties.CREATED_ON)
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

//	@Column(name = Properties.UPDATED_ON)
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@PrePersist
	protected void onCreate()
	{
		this.createdOn = new Date();
	}
	
	@PreUpdate
	protected void onUpdate()
	{
		this.updatedOn = new Date();
	}
}

package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
	private int project_id;
	private String project_name;
	private String description;
	private int trainer_id;
	private String deadline;
	private int project_maximum_marks;
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProject_maximum_marks() {
		return project_maximum_marks;
	}
	public void setProject_maximum_marks(int project_maximum_marks) {
		this.project_maximum_marks = project_maximum_marks;
	}
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	
}

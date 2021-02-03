package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectDetails {
    @Id
	private int student_id;
    private int project_marks;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getProject_marks() {
		return project_marks;
	}
	public void setProject_marks(int project_marks) {
		this.project_marks = project_marks;
	}
    
}

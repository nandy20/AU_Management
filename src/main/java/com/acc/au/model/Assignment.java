package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assignment {
    @Id
	private int assignment_id;
    private String assignment_name;
    private int session_id;
    private int maximum_marks;
    private String deadline;
	public int getAssignment_id() {
		return assignment_id;
	}
	public void setAssignment_id(int assignment_id) {
		this.assignment_id = assignment_id;
	}
	public String getAssignment_name() {
		return assignment_name;
	}
	public void setAssignment_name(String assignment_name) {
		this.assignment_name = assignment_name;
	}
	public int getSession_id() {
		return session_id;
	}
	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}
	public int getMaximum_marks() {
		return maximum_marks;
	}
	public void setMaximum_marks(int maximum_marks) {
		this.maximum_marks = maximum_marks;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
    
    
}

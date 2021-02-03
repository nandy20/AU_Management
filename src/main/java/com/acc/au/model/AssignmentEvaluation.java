package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssignmentEvaluation {
     @Id
     private int assignment_id;
     private int student_id;
	public int getAssignment_id() {
		return assignment_id;
	}
	public void setAssignment_id(int assignment_id) {
		this.assignment_id = assignment_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
     
}

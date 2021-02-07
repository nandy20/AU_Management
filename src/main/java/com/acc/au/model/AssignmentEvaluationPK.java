package com.acc.au.model;

import java.io.Serializable;

public class AssignmentEvaluationPK implements Serializable{
	private static final long serialVersionUID = 1L;
	private int assignment_id;
	private int student_id;
	
	public AssignmentEvaluationPK() {
		super();
	}
	public AssignmentEvaluationPK(Integer student_id,Integer assignment_id) {
		super();
		this.student_id=student_id;
		this.assignment_id=assignment_id;
	}
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

package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
@IdClass(AssignmentEvaluationPK.class)
@Entity
public class AssignmentEvaluation {
     @Id
     private int assignment_id;
     @Id
     private int student_id;
     private int maximum_marks;
     
     public AssignmentEvaluation() {
    	 super();
     }
     public AssignmentEvaluation(Integer student_id,Integer assignment_id) {
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
	public int getMaximum_marks() {
		return maximum_marks;
	}
	public void setMaximum_marks(int maximum_marks) {
		this.maximum_marks = maximum_marks;
	}
     

     
}

package com.acc.au.model;

import java.io.Serializable;

public class AttendancePK implements Serializable {
	private static final long serialVersionUID = 1L;
	private int student_id;
	private int session_id;
	public AttendancePK() {
	   super();
	}	
	public AttendancePK(Integer student_id,Integer session_id) {
		   super();
		   this.student_id=student_id;
		   this.session_id=session_id;
		}
	public int getStudent_id() {
	
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getSession_id() {
		return session_id;
	}
	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}
	

}

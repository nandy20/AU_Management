package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attendance {
    @Id
	private int session_id;
	private int student_id;
	public int getSession_id() {
		return session_id;
	}
	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
}

package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
@IdClass(AttendancePK.class)
@Entity
public class Attendance {
    @Id
	private int session_id;
	private int student_id;
	private String status;
	
	public Attendance() {
		super();
	}
	public Attendance(Integer student_id,Integer session_id) {
		this.student_id=student_id;
		this.session_id=session_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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

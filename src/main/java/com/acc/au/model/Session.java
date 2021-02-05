package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Session {
    @Id
	private int session_id;
    private String session_name;
    private int trainer_id;
    private String start_time;
    private String end_time;
    private String session_date;
    private int batch_id;
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getSession_id() {
		return session_id;
	}
	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}
	public String getSession_name() {
		return session_name;
	}
	public void setSession_name(String session_name) {
		this.session_name = session_name;
	}
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getSession_date() {
		return session_date;
	}
	public void setSession_date(String session_date) {
		this.session_date = session_date;
	}
    
}

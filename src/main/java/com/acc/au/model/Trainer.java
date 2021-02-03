package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
    @Id
	private int trainer_id;
    private String trainer_name;
    private String trainer_email;
    private String trainer_username;
    private String trainer_password;
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public String getTrainer_email() {
		return trainer_email;
	}
	public void setTrainer_email(String trainer_email) {
		this.trainer_email = trainer_email;
	}
	public String getTrainer_username() {
		return trainer_username;
	}
	public void setTrainer_username(String trainer_username) {
		this.trainer_username = trainer_username;
	}
	public String getTrainer_password() {
		return trainer_password;
	}
	public void setTrainer_password(String trainer_password) {
		this.trainer_password = trainer_password;
	}
    
}
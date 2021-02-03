package com.acc.au.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
    @Id
	private int trainer_id;
    private String trainer_name;
    private String trainer_email;
    @Column(name="trainer_username")
    private String trainerusername;
    @Column(name="trainer_password")
    private String trainerpassword;
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
	public String getTrainerusername() {
		return trainerusername;
	}
	public void setTrainerusername(String trainerusername) {
		this.trainerusername = trainerusername;
	}
	public String getTrainerpassword() {
		return trainerpassword;
	}
	public void setTrainerpassword(String trainerpassword) {
		this.trainerpassword = trainerpassword;
	}
    
}

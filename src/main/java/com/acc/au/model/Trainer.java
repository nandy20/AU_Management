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
    private String trainerUsername;
    @Column(name="trainer_password")
    private String trainerPwd;
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
	public String getTrainerUsername() {
		return trainerUsername;
	}
	public void setTrainerUsername(String trainerUsername) {
		this.trainerUsername = trainerUsername;
	}
	public String getTrainerPwd() {
		return trainerPwd;
	}
	public void setTrainerPwd(String trainerPwd) {
		this.trainerPwd = trainerPwd;
	}
    
}

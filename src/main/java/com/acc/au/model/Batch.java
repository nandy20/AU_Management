package com.acc.au.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Batch {
	
	@Id
     private int batch_id;
     private String btach_name;
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public String getBtach_name() {
		return btach_name;
	}
	public void setBtach_name(String btach_name) {
		this.btach_name = btach_name;
	}
     
}

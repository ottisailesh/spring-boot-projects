package com.example.pagerduty.pojo;

import javax.persistence.Entity;

public class Developer {
	
	int id;
	int team_id;
	String name;
	String phone_number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phone_number;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}
	
}

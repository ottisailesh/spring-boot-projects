package com.example.pagerduty.pojo;

import java.util.List;

public class CreateTeam {
	
	Team team;
	List<Developer> developers;
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public List<Developer> getDevelopers() {
		return developers;
	}
	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
	
	
}

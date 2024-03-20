package com.hibernate.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Footbal {
	@Id
	private int jerssyNumber;
	private String name;
	private String team;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getjerssyNumber() {
		return jerssyNumber;
	}
	public void setjerssyNumber(int jerssyNumber) {
		this.jerssyNumber = jerssyNumber;
	}
	@Override
	public String toString() {
		return "Footbal [name=" + name + ", team=" + team + ", age=" + jerssyNumber + "]";
	}
	
}

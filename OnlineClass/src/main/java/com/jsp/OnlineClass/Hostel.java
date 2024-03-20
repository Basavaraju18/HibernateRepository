package com.jsp.OnlineClass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HostelDetails")
public class Hostel {
	@Id
	private int roomNumber;
	private String name;
	private String Collage;
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollage() {
		return Collage;
	}
	public void setCollage(String collage) {
		Collage = collage;
	}
	@Override
	public String toString() {
		return "Hostel [roomNumber=" + roomNumber + ", name=" + name + ", Collage=" + Collage + "]";
	}
}

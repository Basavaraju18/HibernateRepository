package com.jsp.User_management.component;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {
	private String uname;
	@Id
	private int uid;
	private long contact;
	@Override
	public String toString() {
		return "User [uname=" + uname + ", uid=" + uid + ", contact=" + contact + "]";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
}

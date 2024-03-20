package com.jsp.spring.component;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {
	@Id
	private int uid;
	private String uname;
	private long ucontact;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getUcontact() {
		return ucontact;
	}
	public void setUcontact(long ucontact) {
		this.ucontact = ucontact;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", ucontact=" + ucontact + "]";
	}
}

package com.ManyToMany.Level1Cache;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int uid;
	private String uName;
	private String uPass;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uName=" + uName + ", uPass=" + uPass + "]";
	}
}

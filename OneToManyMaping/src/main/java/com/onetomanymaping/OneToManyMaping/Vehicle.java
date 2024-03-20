package com.onetomanymaping.OneToManyMaping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import org.hibernate.annotations.ManyToAny;

@Entity
public class Vehicle {

	@Id
	private int vid;
	private String vname;
	
	@ManyToOne
	private Person pw;
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + "]";
	}

}




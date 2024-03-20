package com.LevelOnetoMany.Level1OnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurent {
	
	@Id
	private int rId;
	private String rName;
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
		}
	@Override
	public String toString() {
		return "Restaurent [rId=" + rId + ", rName=" + rName + "]";
	}
	
	

}

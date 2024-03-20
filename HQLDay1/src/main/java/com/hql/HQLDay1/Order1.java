package com.hql.HQLDay1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order1 {
	
	@Id
	private int oId;
	private String oName;
	private String oPllace;
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoPllace() {
		return oPllace;
	}
	public void setoPllace(String oPllace) {
		this.oPllace = oPllace;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oName=" + oName + ", oPllace=" + oPllace + "]";
	}
}

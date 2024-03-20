package com.maping.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniqueAuthority {
	@Id
	private int adharId;
	private long adharContact;
	
	
	public int getAdharId() {
		return adharId;
	}
	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}
	public long getAdharContact() {
		return adharContact;
	}
	public void setAdharContact(long adharContact) {
		this.adharContact = adharContact;
	}
	@Override
	public String toString() {
		return "UniqueAuthority [adharId=" + adharId + ", adharContact=" + adharContact + "]";
	}

}

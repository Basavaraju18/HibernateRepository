package com.hibernate.OneToOne12;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
	public class PhoneNumber {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String number;

	    @OneToOne
	    private Person person;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		@Override
		public String toString() {
			return "PhoneNumber [id=" + id + ", number=" + number + ", person=" + person + "]";
		}


	}

	
	


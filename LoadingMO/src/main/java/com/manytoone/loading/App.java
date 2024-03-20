package com.manytoone.loading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {

		Customer c1=new Customer();
		c1.setC_id(1);
		c1.setC_name("Arun");
		
		
		Product p1=new Product ();
		p1.setId(101);
		p1.setpName("Laptop");
		p1.setPrice(1222);
	
		Product p2=new Product ();
		p1.setId(102);
		p1.setpName("charger");
		p1.setPrice(500);
		
		
		 Configuration cfg= new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Customer.class);
		 	SessionFactory sf=cfg.buildSessionFactory();
		 	Session session = sf.openSession();
		 	Transaction transaction=session.beginTransaction();
		 Customer cu=session.get(Customer.class, 101);
		 	
		 	session.save(p1);
		 	session.save(p2);
		 	session.save(c1);
		 	transaction.commit();
	}

}

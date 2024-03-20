package com.jsp.spring.demo.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spring.component.User;

@Repository
public class UserRepository {
	@Autowired
	private User user1;
	
	public void hbConfig() {
		
		
		user1.setUname("Bas");
		user1.setUid(101);
		user1.setUcontact(98837465);
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trans=sess.beginTransaction();
		sess.save(user1);
		trans.commit();
	}
	
}

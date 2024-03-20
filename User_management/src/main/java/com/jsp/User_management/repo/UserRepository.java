//package com.jsp.User_management.repo;
//
//public class UserRepository {
//
//}


package com.jsp.User_management.repo;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jsp.User_management.component.User;

import org.hibernate.Session;

@Repository
public class UserRepository {
	@Autowired
	private User user1;
	public void hbConfig() {
		user1.setUname("Basavaraj");
		user1.setUid(101);
		user1.setContact(9731477948l);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trans=sess.beginTransaction();
		sess.save(user1);
		trans.commit();

	}
}

// spring architectur


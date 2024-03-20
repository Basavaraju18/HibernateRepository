package com.employee.Employee;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Hql {
public static void main(String[] args) {
	Configuration cf=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Project.class);
	SessionFactory sf=cf.buildSessionFactory();
	Session session=sf.openSession();
	Transaction trans=session.beginTransaction();
	Query query=session.createQuery("from Project p inner join p.elist a where p.pid=104"
			);
	List<Object[]> plist=query.list();
	
	for(Object[] p:plist) {
		System.out.println(Arrays.toString(p));

	}
	trans.commit();
}
}

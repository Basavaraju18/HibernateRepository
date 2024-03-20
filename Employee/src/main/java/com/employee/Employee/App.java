package com.employee.Employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Employee e1=new Employee();
    	e1.setEid(1);
    	e1.setEname("Amon");
    	
    	Employee e2=new Employee();
    	e2.setEid(2);
    	e2.setEname("kaneki");
    	
    	Employee e3=new Employee();
    	e3.setEid(3);
    	e3.setEname("toka");
    	
    	Employee e4=new Employee();
    	e4.setEid(4);
    	e4.setEname("Zetsuka");
    	
    	Project p1=new Project();
    	p1.setPid(101);
    	p1.setName("flipkart");
    	
    	Project p2=new Project();
    	p2.setPid(102);
    	p2.setName("facebook");
    	
    	Project p3=new Project();
    	p3.setPid(103);
    	p3.setName("watsapp");
    	
    	Project p4=new Project();
    	p4.setPid(104);
    	p4.setName("youtube");
    	
    	List<Employee> elist=new ArrayList<Employee>();
    	elist.add(e1);
    	elist.add(e2);
    	elist.add(e4);
    	p1.setElist(elist);
    	p4.setElist(elist);
    	
    	List<Employee> elist1=new ArrayList<Employee>();
    	elist1.add(e1);
    	elist1.add(e2);
    	elist1.add(e4);
    	p2.setElist(elist1);
    	
    	List<Employee> elist2=new ArrayList<Employee>();
    	elist2.add(e3);
    	elist2.add(e2);
    	elist2.add(e4);
    	p3.setElist(elist2);
    	
    	
    	List<Project> plist=new ArrayList<Project>();
    	plist.add(p2);
    	plist.add(p3);
    	plist.add(p4);
    	e1.setPlist(plist);
    	e3.setPlist(plist);
    	
    	List<Project> plist1=new ArrayList<Project>();
    	plist1.add(p2);
    	plist1.add(p3);
    	e4.setPlist(plist1);
    	
    	List<Project> plist2=new ArrayList<Project>();
    	plist2.add(p2);
    	plist2.add(p3);
    	plist2.add(p4);
    	plist2.add(p1);

    	e2.setPlist(plist2);
    	
    	
    	Configuration cf=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Project.class);
    	SessionFactory sf=cf.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction trans=session.beginTransaction();
    	
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	session.save(e4);
    	session.save(p1);
    	session.save(p2);
    	session.save(p3);
    	session.save(p4);
    	
    	
    	trans.commit();
    }
}

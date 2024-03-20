
package com.onetomanymaping.OneToManyMaping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//write a hibernate program to achive many to many mapping with respect to student and book table
public class App 
{
    public static void main( String[] args )
    {
    	Vehicle v=new Vehicle();
    	v.setVid(123);
    	v.setVname("BMW");
    	
    	Vehicle v2=new Vehicle();
    	v2.setVid(223);
    	v2.setVname("Mt15");
    	
    	
    	Person p=new Person();
    	p.setpName("Arun");
    	p.setpId(1);
    	p.setpContact(9731477876l);
    	
    	Person p2=new Person();
    	p2.setpId(2);
    	p2.setpName("BAS");
    	p2.setpContact(98765432l);
    	
    	
    	List<Vehicle> vList=new ArrayList<Vehicle>();
    	vList.add(v);
    	vList.add(v2);
    	p.setVl(vList);
    	
    	
    	Configuration cfg= new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Vehicle.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.save(p);
    	session.save(p2);
    	session.save(v);
    	session.save(v2);
    	transaction.commit();
    	session.close();
    }
}

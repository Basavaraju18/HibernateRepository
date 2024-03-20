package com.hibernate.Demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Footbal f1=new Footbal();
    	f1.setName("Messsi");
    	f1.setjerssyNumber(10);
    	f1.setTeam("Paries");
    	
    	Footbal f2=new Footbal();
    	f2.setName("R Levendoski");
    	f2.setjerssyNumber(9);
    	f2.setTeam("Barcelona");
    	
    	
    	Footbal f3=new Footbal();
    	f3.setName("Karim Benzama");
    	f3.setjerssyNumber(19);
    	f3.setTeam("Real madrid");
    	
    	Footbal f4=new Footbal();
    	f4.setName("NG Kante");
    	f4.setjerssyNumber(13);
    	f4.setTeam("Chelsea");
    	
    	Footbal f5=new Footbal();
    	f5.setName("Sedio mane");
    	f5.setjerssyNumber(110);
    	f5.setTeam("LivelPool");
    	
    	Footbal f6=new Footbal();
    	f6.setName("Luis Suraz mane");
    	f6.setjerssyNumber(109);
    	f6.setTeam("Athletico Madrid");
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Footbal.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	List<Footbal> fList=new ArrayList<Footbal>();
    	fList.add(f1);
    	fList.add(f2);
    	fList.add(f3);
    	fList.add(f4);
    	fList.add(f5);
    	fList.add(f6);
    	
    	for(Footbal f:fList) {
    		session.save(f);
    		
    	}
    	
    	transaction.commit();
    	session.close();
    	
    }
}

// hibernate  architecture  annotations, lazy loading eager loading 1st level cache second level cache  jdbc hibernate

package com.jsp.OnlineClass;

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
    	Hostel h1 = new Hostel();
    	h1.setRoomNumber(1);
    	h1.setName("Arun");
    	h1.setCollage("BMS");
    	
    	Hostel h2 = new Hostel();
    	h2.setRoomNumber(2);
    	h2.setName("Kiran");
    	h2.setCollage("BMS");
    	
    	Hostel h3 = new Hostel();
    	h3.setRoomNumber(3);
    	h3.setName("Tarun");
    	h3.setCollage("BMS");
    	
    	Hostel h4 = new Hostel();
    	h4.setRoomNumber(4);
    	h4.setName("Charan");
    	h4.setCollage("BMS");
    	
       Configuration cfg = new Configuration().addAnnotatedClass(Hostel.class);
       cfg.configure();
       SessionFactory buildSessionFactory = cfg.buildSessionFactory();  // these build session factory method will create a implementation object 		and it will return the implementation object
       // till now it will connect the jdbc connection 
       // after this we have to open the connection bu using open session 
       //SessionFactory The main contract here is the creation of Session instances. Usually an application has a single SessionFactory instance 		and threadsservicing client requests obtain Session instances from this factory. The internal state of a SessionFactory is immutable



       Session session = buildSessionFactory.openSession();
       // connection is established but not open yet
       Transaction beginTransaction = session.beginTransaction();
       
       List<Hostel> hList = new ArrayList<Hostel>();
       hList.add(h4);
       hList.add(h3);
       hList.add(h2);
       hList.add(h1);
       
       for (Hostel h : hList) {
    	   session.save(h);
	}
       	beginTransaction.commit();
   		session.close();
      
       
    }
}

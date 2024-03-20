package com.maping.OneToOneMapping;


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
    	UniqueAuthority ua=new UniqueAuthority();
    	ua.setAdharId(123);
    	ua.setAdharContact(9731);
    	
    	Person p =new Person();
    	p.setPid(101);
    	p.setName("Bas");
    	p.setPcontact(9731477945L);
    	p.setUidai(ua);
    	
    	
    	
    	Configuration cfg= new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(UniqueAuthority.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.save(p);
    	session.save(ua);
    	transaction.commit();
    }
    
}

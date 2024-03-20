package com.hibarnate.test.Hibarnate;


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
    	Employee emp=new Employee();
    	emp.setId(111);
    	emp.setName("Bas");
    	emp.setSal("1000");
    	
    	Employee emp2=new Employee();
    	emp2.setId(122);
    	emp2.setName("Arun");
    	emp2.setSal("1000");
    	
    	Employee emp3=new Employee();
    	emp3.setId(133);
    	emp3.setName("Kiran");
    	emp3.setSal("1000");
    	
    	Employee emp4=new Employee();
    	emp4.setId(144);
    	emp4.setName("charan");
    	emp4.setSal("1000");
    	
    	Employee emp5=new Employee();
    	emp5.setId(155);
    	emp5.setName("Varun");
    	emp5.setSal("1000");
    	
    	Configuration cfg= new Configuration().configure().addAnnotatedClass(Employee.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.save(emp);
    	session.save(emp2);
    	session.save(emp3);
    	session.save(emp4);
    	session.save(emp5);
    	transaction.commit();
    	session.close();
    }
}

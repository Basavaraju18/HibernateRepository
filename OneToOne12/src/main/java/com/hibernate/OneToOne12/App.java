package com.hibernate.OneToOne12;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        // Create the SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Create a new session
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Create a person
        Person person = new Person();
        person.setName("John Doe");

        // Create a phone number
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("1234567890");
        phoneNumber.setPerson(person);

        // Associate the phone number with the person
        person.setPhoneNumber(phoneNumber);

        // Save the person and phone number
        session.save(person);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session and session factory
        session.close();
        sessionFactory.close();
    }
}


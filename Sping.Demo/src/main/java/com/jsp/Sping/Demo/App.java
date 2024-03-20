package com.jsp.Sping.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring.demo.repo.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext bean=new ClassPathXmlApplicationContext("spring.xml");
     UserRepository u1=(UserRepository)bean.getBean(UserRepository.class, "user1");
     u1.hbConfig();
    }
}

package com.samudra.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException 
    {
        System.out.println( "Project running");
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        
        /* 
         * 1.SessionFactory(interface) is used to get sessions. 
         * 2.sessions are actually used to save, alter, delete the datas.
         * 3.buildSessionFactory actually returns the session  */
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println(factory);
        
        //creating student 
        student st = new student();
        st.setId(101);
        st.setName("JHON");
        st.setCity("london");
        
        System.out.println(st);
        
        
        //creating address
        address ad = new address();
        ad.setStreet("baker street");
        ad.setCity("london");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        
        
        FileInputStream fis = new FileInputStream(""); //path to be defined under FileInputStream
        
        /*Now in next portion we'll get the taste why we called SessionFactory interface.
         * from a SesssionFactory object we'll call a method .getCuurentSession thereafter
         * we will initialize Transaction eventually coomit the transaction.
         */
        
        Session session = factory.openSession();
        
        //if session is already opened then use below query
        //Session session = factory.getCurrentSession();
        
        session.beginTransaction();
        session.save(st); 		
        session.save(ad);
        session.getTransaction().commit();
        session.close();
        
    }
}



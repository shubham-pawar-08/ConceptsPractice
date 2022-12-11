package com.maven.DemooHib;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Asach aa = new Asach();
        aa.setAid(103);
        aa.setAname("Shubham");
        aa.setColor("Blue");
        
        Address add = new Address();
        add.setStreet("street");
        add.setCity("Uran");
        add.setOpen(true);
        add.setAddeDate(new Date());
        add.setX(1212);
        FileInputStream fis = new FileInputStream("src/main/java/anita.jpeg");
        byte[] data = new byte [fis.available()];
        fis.read(data);
        add.setImage(data);
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Asach.class);
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession(); 
        Transaction tx = session.beginTransaction();

        session.save(aa);
        session.save(add);
        tx.commit();
        session.close();
        
    }
}

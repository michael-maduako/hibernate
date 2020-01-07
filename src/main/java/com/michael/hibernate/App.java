package com.michael.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory factory= meta.getSessionFactoryBuilder().build();
    	Session session= factory.openSession();
    	Transaction t1= session.beginTransaction();
    	
    	Student s1= new Student("David","1126 HighField Ct");
    	Student s2= new Student("Emre","1126 HighField Ct");
    	Student s3= new Student("Akku","1126 HighField Ct");
    	session.save(s1);session.save(s2);session.save(s3);
    	t1.commit();
    	System.out.println("Student records saved successfully");
    	factory.close();session.close();
    	
    }
}

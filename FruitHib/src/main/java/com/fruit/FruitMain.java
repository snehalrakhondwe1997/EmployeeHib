package com.fruit;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits f1 =null;
//		Fruits f1 = new Fruits();
//		f1.setId(4);
//		f1.setName("Banana");
//		f1.setColor("Yellow");
		
		Configuration con = new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Fruits.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();
		s.beginTransaction();
//		s.save(f1);
		Query q = s.createQuery("from Fruits where id=2");
		q.setCacheable(true);
		f1 = (Fruits) q.uniqueResult();
		System.out.println(f1);
		s.getTransaction().commit();
		s.close();
		
		Session s1 = sf.openSession();
		s1.beginTransaction();
		Query q1 = s1.createQuery("from Fruits where id=2");
		q1.setCacheable(true);
		f1 = (Fruits) q1.uniqueResult();
		System.out.println(f1);
		s1.getTransaction().commit();
		s1.close();
	}

}

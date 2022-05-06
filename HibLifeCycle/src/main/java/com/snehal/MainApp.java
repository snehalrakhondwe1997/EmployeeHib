package com.snehal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		Configuration con = new Configuration().configure().addAnnotatedClass(Demo.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(sr);
		Session s = sf.openSession();
		s.beginTransaction();
		//Transient
		obj.setId(6);
		obj.setName("Ajay");
//		s.save(obj); //Persistent
//		obj.setName("Anuj");
//		s.getTransaction().commit();
		
		//Detached
//		s.save(obj);
//		s.getTransaction().commit();
//		s.evict(obj);
//		obj.setName("Anu");
		
		//Removed
		s.save(obj);
		s.delete(obj);
		s.getTransaction().commit();
		
		
		s.close();
	}

}

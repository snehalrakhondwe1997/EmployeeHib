package com.snehal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("Kumar");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg);
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		s.save(e1);
		tx.commit();
		System.out.println("Record saved");
	}

}

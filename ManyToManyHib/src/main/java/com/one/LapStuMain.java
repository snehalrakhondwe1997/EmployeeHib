package com.one;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class LapStuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Laptop lt = null;
		Laptop lt = new Laptop();
		lt.setLid(6);
		lt.setLname("Dell");
		
		Student sd = null;
//		Student sd = new Student();
//		sd.setRollno(102);
//		sd.setName("Vivek");
//		sd.setMarks(90);
//		sd.getLt().add(lt);
		
//		lt.getSd().add(sd);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		sd = (Student) s.get(Student.class, 101);
//		lt.setSd(sd);
		
//		lt = (Laptop) s.get(Laptop.class, 5);
		sd.getLt().add(lt);
		lt.getSd().add(sd);
		s.save(lt);
//		s.save(sd);
		tx.commit();
		System.out.println("Record saved");
	}

}

package com.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyCourses mc = null;
		CourseTeacher ct = new CourseTeacher();
		ct.setFname("Shubham");
		ct.setLname("Sureka");
		MyCourses mc = new MyCourses();
		mc.setId(2);
		mc.setName("Python");
		mc.setPrice(30000);
		mc.setTname(ct);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(MyCourses.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(mc);
//		mc = (MyCourses) s.get(MyCourses.class, 2);
		tx.commit();
//		System.out.println(mc);
		System.out.println("Record Saved");

	}

}

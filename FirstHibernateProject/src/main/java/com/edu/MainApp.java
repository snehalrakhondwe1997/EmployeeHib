package com.edu;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EduStudent sob = null;
//		EduStudent sob = new EduStudent();
//		sob.setSid(2);
//		sob.setName("Veeru");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(EduStudent.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Criteria crit = s.createCriteria(EduStudent.class);
		Criterion cr = Restrictions.eq("sname", "Jai");
		Criterion cr1 = Restrictions.eq("sid", 1);
		crit.add(cr);
		crit.add(cr1);
		EduStudent es = (EduStudent) crit.uniqueResult();
		System.out.println(es);
//		s.save(sob);
//		sob = (EduStudent) s.get(EduStudent.class, 2);
		tx.commit();
//		System.out.println("Record Saved");
//		System.out.println(sob);
		s.close();
	}

}

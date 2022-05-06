package com.otm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Puppies pup = new Puppies();
//		pup.setPid(1002);
//		pup.setPname("Alvin");
		
		Dog dog = null;
//		Dog dog = new Dog();
//		dog.setId(1);
//		dog.setBreed("Golden Retriever");
//		dog.getPuppy().add(pup);
		
//		pup.setDog(dog);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Puppies.class).addAnnotatedClass(Dog.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();
		s.beginTransaction();
//		s.save(dog);
//		s.save(pup);
		dog = (Dog) s.get(Dog.class, 1);
		System.out.println(dog);
		s.getTransaction().commit();
		s.close();
//		System.out.println("Record saved");

	}

}

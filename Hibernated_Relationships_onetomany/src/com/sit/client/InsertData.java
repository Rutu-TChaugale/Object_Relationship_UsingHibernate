package com.sit.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sit.configuration.HibernateUtil;
import com.sit.model.Company;
import com.sit.model.Employee;

public class InsertData {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Company c1=new Company();
		c1.setCid(101);
		c1.setCname("SkillsIt");
		c1.setCaddr("Karvenagar");
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("Santosh");
		e1.setEemail("santosh@gmail.com");
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEname("Akshay");
		e2.setEemail("akshay@gmail.com");
		Employee e3=new Employee();
		e3.setEid(3);
		e3.setEname("Aparna");
		e3.setEemail("aparna@gmail.com");
		
		c1.getEmp().add(e1);
		c1.getEmp().add(e2);
		c1.getEmp().add(e3);
		
		//for checkin bidirectional
		e1.setCmp(c1);
		e2.setCmp(c1);
		e3.setCmp(c1);

		
		session.save(c1);
		tx.commit();
		
		

	}

}

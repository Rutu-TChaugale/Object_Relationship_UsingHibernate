package com.sit.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sit.configuration.HibernateUtil;
import com.sit.model.Subject;
import com.sit.model.Teacher;

public class InsertData {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Teacher t1=new Teacher();
		t1.setTid(101);
		t1.setTname("Santosh");
		
		Teacher t2=new Teacher();
		t2.setTid(102);
		t2.setTname("Akshay");
		
		Teacher t3=new Teacher();
		t3.setTid(103);
		t3.setTname("Jyoti");
		
		Subject s1=new Subject();
		s1.setSid(1);
		s1.setSname("Java");
		
		Subject s2=new Subject();
		s2.setSid(2);
		s2.setSname("Python");
		
		Subject s3=new Subject();
		s3.setSid(3);
		s3.setSname("Html");
		
		Set<Subject> teach1=new HashSet<>();
		teach1.add(s1);
		teach1.add(s2);
	}

}

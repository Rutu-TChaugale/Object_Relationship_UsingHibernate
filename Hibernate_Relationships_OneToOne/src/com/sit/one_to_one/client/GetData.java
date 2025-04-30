package com.sit.one_to_one.client;

import org.hibernate.Session;

import com.sit.one_to_one.configuration.HibernateUtil;
import com.sit.one_to_one.model.Pancard;
import com.sit.one_to_one.model.Student;

public class GetData {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
//		Student stud = session.get(Student.class, 1);
//		System.out.println(stud.getSid());
//		System.out.println(stud.getSname());
//		System.out.println(stud.getSemail());
//		System.out.println(stud.getPan().getPid());
//		System.out.println(stud.getPan().getPno());
//		System.out.println(stud.getPan().getPname());
//		

		Pancard p=session.get(Pancard.class, 101);
		//System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getPno());
		System.out.println(p.getStu().getSid());
		System.out.println(p.getStu().getSname());
		System.out.println(p.getStu().getSemail());


	}

}

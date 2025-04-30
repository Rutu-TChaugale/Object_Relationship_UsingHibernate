package com.sit.one_to_one.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sit.one_to_one.configuration.HibernateUtil;
import com.sit.one_to_one.model.Pancard;
import com.sit.one_to_one.model.Student;

public class InsertData {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Student stu = new Student();
		stu.setSid(1);
		stu.setSname("Rutika");
		stu.setSemail("rutu@gmail.com");

		Student stu1 = new Student();
		stu1.setSid(2);
		stu1.setSname("Altmash");
		stu1.setSemail("altya@gmail.com");

		Student stu2 = new Student();
		stu2.setSid(3);
		stu2.setSname("Pranoti");
		stu2.setSemail("panna@gmail.com");

		Pancard pan = new Pancard();
		pan.setPid(101);
		pan.setPno("GSWH101");
		pan.setPname("Santosh");

		Pancard pan1 = new Pancard();
		pan1.setPid(102);
		pan1.setPno("CTPP102");
		pan1.setPname("vaishnavi");

		Pancard pan2 = new Pancard();
		pan2.setPid(103);
		pan2.setPno("MNSE103");
		pan2.setPname("Akashy");

		session.save(stu);
		session.save(stu1);
		session.save(stu2);

		session.save(pan);
		session.save(pan1);
		session.save(pan2);

//		stu.setPan(pan);
//		stu1.setPan(pan1);
//		stu2.setPan(pan2);
////
		pan2.setStu(stu2);
		pan1.setStu(stu);
		pan.setStu(stu1);

		tx.commit();

	}

}

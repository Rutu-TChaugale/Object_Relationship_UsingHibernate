package com.sit.one_to_one.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	@Id
	private int pid;
	private String pno;
	private String pname;

	@OneToOne(cascade = CascadeType.ALL)
	private Student stu;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Pancard [pid=" + pid + ", pno=" + pno + ", pname=" + pname + ", stu=" + stu + "]";
	}

}

package com.sit.one_to_one.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String semail;
	
	//secondary reference,has-a-relationships
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="F_pid")
	private Pancard pan;
	//getter setter methods
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public Pancard getPan() {
		return pan;
	}

	public void setPan(Pancard pan) {
		this.pan = pan;
	}
//tosTring
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", pan=" + pan + "]";
	}

}

package com.sit.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private String eemail;
	
	//for bidircetinql purpose 
	@ManyToOne(cascade = CascadeType.ALL)
	private Company cmp;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	
	
	public Company getCmp() {
		return cmp;
	}
	public void setCmp(Company cmp) {
		this.cmp = cmp;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", cmp=" + cmp + "]";
	}
	
	
	
	
	

}

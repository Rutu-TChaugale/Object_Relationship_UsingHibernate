package com.sit.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Company {
		@Id
		private int cid;
		private String cname;
		private String caddr;
		
		//here objcet created becoz many employee add in single company
		@OneToMany(cascade = CascadeType.ALL)
		private Set<Employee> emp= new HashSet<>();

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getCaddr() {
			return caddr;
		}

		public void setCaddr(String caddr) {
			this.caddr = caddr;
		}

		public Set<Employee> getEmp() {
			return emp;
		}

		public void setEmp(Set<Employee> emp) {
			this.emp = emp;
		}

		@Override
		public String toString() {
			return "Company [cid=" + cid + ", cname=" + cname + ", caddr=" + caddr + ", emp=" + emp + "]";
		}

		
		
		
}

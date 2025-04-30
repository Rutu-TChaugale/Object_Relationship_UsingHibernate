package com.sit.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	
	private int tid;
	private String tname;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Subject> sub;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Set<Subject> getSub() {
		return sub;
	}

	public void setSub(Set<Subject> sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", sub=" + sub + "]";
	}
	
	

}

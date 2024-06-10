package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AC{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int ac_Id;
	String ac_Name;
	int ac_Price;
	
	public AC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AC(String ac_Name, int ac_Price) {
		super();
		this.ac_Name = ac_Name;
		this.ac_Price = ac_Price;
	}

	public AC(int ac_Id, String ac_Name, int ac_Price) {
		super();
		this.ac_Id = ac_Id;
		this.ac_Name = ac_Name;
		this.ac_Price = ac_Price;
	}

	public int getAc_Id() {
		return ac_Id;
	}

	public void setAc_Id(int ac_Id) {
		this.ac_Id = ac_Id;
	}

	public String getAc_Name() {
		return ac_Name;
	}

	public void setAc_Name(String ac_Name) {
		this.ac_Name = ac_Name;
	}

	public int getAc_Price() {
		return ac_Price;
	}

	public void setAc_Price(int ac_Price) {
		this.ac_Price = ac_Price;
	}

	@Override
	public String toString() {
		return "AC [ac_Id=" + ac_Id + ", ac_Name=" + ac_Name + ", ac_Price=" + ac_Price + "]";
	}	
}

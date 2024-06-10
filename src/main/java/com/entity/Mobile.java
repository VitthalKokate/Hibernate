package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int mob_Id;
	String mob_Name;
	String mob_Comp;
	int mob_Price;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mob_Id, String mob_Name, String mob_Comp, int mob_Price) {
		super();
		this.mob_Id = mob_Id;
		this.mob_Name = mob_Name;
		this.mob_Comp = mob_Comp;
		this.mob_Price = mob_Price;
	}

	public Mobile(String mob_Name, String mob_Comp, int mob_Price) {
		super();
		this.mob_Name = mob_Name;
		this.mob_Comp = mob_Comp;
		this.mob_Price = mob_Price;
	}

	public int getMob_Id() {
		return mob_Id;
	}

	public void setMob_Id(int mob_Id) {
		this.mob_Id = mob_Id;
	}

	public String getMob_Name() {
		return mob_Name;
	}

	public void setMob_Name(String mob_Name) {
		this.mob_Name = mob_Name;
	}

	public String getMob_Comp() {
		return mob_Comp;
	}

	public void setMob_Comp(String mob_Comp) {
		this.mob_Comp = mob_Comp;
	}

	public int getMob_Price() {
		return mob_Price;
	}

	public void setMob_Price(int mob_Price) {
		this.mob_Price = mob_Price;
	}

	@Override
	public String toString() {
		return "Mobile [mob_Id=" + mob_Id + ", mob_Name=" + mob_Name + ", mob_Comp=" + mob_Comp + ", mob_Price="
				+ mob_Price + "]";
	}
	
}

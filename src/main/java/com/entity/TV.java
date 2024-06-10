package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int tv_Id;
	String tv_Name;
	String tv_Company;
	int tv_Price;
	
	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public TV(int tv_Id, String tv_Name, String tv_Company, int tv_Price) {
		super();
		this.tv_Id = tv_Id;
		this.tv_Name = tv_Name;
		this.tv_Company = tv_Company;
		this.tv_Price = tv_Price;
	}

	public TV(String tv_Name, String tv_Company, int tv_Price) {
		super();
		this.tv_Name = tv_Name;
		this.tv_Company = tv_Company;
		this.tv_Price = tv_Price;
	}

	public int getTv_Id() {
		return tv_Id;
	}

	public void setTv_Id(int tv_Id) {
		this.tv_Id = tv_Id;
	}

	public String getTv_Name() {
		return tv_Name;
	}
	
	public void setTv_Name(String tv_Name) {
		this.tv_Name = tv_Name;
	}

	public String getTv_Company() {
		return tv_Company;
	}

	public void setTv_Company(String tv_Company) {
		this.tv_Company = tv_Company;
	}

	public int getTv_Price() {
		return tv_Price;
	}

	public void setTv_Price(int tv_Price) {
		this.tv_Price = tv_Price;
	}

	@Override
	public String toString() {
		return "TV [tv_Id=" + tv_Id + ", tv_Name=" + tv_Name + ", tv_Company=" + tv_Company + ", tv_Price=" + tv_Price
				+ "]";
	}	

}

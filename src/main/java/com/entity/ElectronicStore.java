package com.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class ElectronicStore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String ownerName;
	long turnOver;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tv_Id")
	ArrayList<TV> tv;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "mob_Id")
	ArrayList<Mobile> mobile;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ac_Id")
	ArrayList<AC> ac;

	public ElectronicStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicStore(int id, String name, String ownerName, long turnOver, ArrayList<TV> tv,
			ArrayList<Mobile> mobile, ArrayList<AC> ac) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.turnOver = turnOver;
		this.tv = tv;
		this.mobile = mobile;
		this.ac = ac;
	}

	public ElectronicStore(String name, String ownerName, long turnOver, ArrayList<TV> tv, ArrayList<Mobile> mobile,
			ArrayList<AC> ac) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.turnOver = turnOver;
		this.tv = tv;
		this.mobile = mobile;
		this.ac = ac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(long turnOver) {
		this.turnOver = turnOver;
	}

	public ArrayList<TV> getTv() {
		return tv;
	}

	public void setTv(ArrayList<TV> tv) {
		this.tv = tv;
	}

	public ArrayList<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(ArrayList<Mobile> mobile) {
		this.mobile = mobile;
	}

	public ArrayList<AC> getAc() {
		return ac;
	}

	public void setAc(ArrayList<AC> ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "ElectronicStore [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", turnOver=" + turnOver
				+ ", tv=" + tv + ", mobile=" + mobile + ", ac=" + ac + "]";
	}
	
}

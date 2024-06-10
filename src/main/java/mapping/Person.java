package mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	String name;
	int mobNo;
	String address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	Passport passport;
	
	public Person(String name, int mobNo, String address, Passport passport) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.address = address;
		this.passport = passport;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", mobNo=" + mobNo + ", address=" + address + ", passport=" + passport + "]";
	}
}

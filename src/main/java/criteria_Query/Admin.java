package criteria_Query;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	String Date;
	String Name;
	String Address;
	int MobNo;
	

	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String date, String name, String address, int mobNo) {
		super();
		Date = date;
		Name = name;
		Address = address;
		MobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Admin [Date=" + Date + ", Name=" + Name + ", Address=" + Address + ", MobNo=" + MobNo + "]";
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMobNo() {
		return MobNo;
	}
	public void setMobNo(int mobNo) {
		MobNo = mobNo;
	}
		
	
}

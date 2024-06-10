package mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int passNo;
	String validy;
	
	public Passport(int passNo, String validy) {
		super();
		this.passNo = passNo;
		this.validy = validy;
	}
	
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassNo() {
		return passNo;
	}
	public void setPassNo(int passNo) {
		this.passNo = passNo;
	}
	public String getValidy() {
		return validy;
	}
	public void setValidy(String validy) {
		this.validy = validy;
	}
	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", passNo=" + passNo + ", validy=" + validy + "]";
	}	
}
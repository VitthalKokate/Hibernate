package mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cid;
	String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "acid")
	Accident accident;
	
	public Car(String name, Accident accident) {
		super();
		this.name = name;
		this.accident = accident;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int cid, String name, Accident accident) {
		super();
		this.cid = cid;
		this.name = name;
		this.accident = accident;
	}
	
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", name=" + name + ", accident=" + accident + "]";
	} 
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Accident getAccident() {
		return accident;
	}
	public void setAccident(Accident accident) {
		this.accident = accident;
	}
	
}

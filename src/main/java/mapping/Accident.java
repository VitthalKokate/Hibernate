package mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accident {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int acid;
	String place;
	
	public Accident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accident(String place) {
		super();
		this.place = place;
	}
	public Accident(int acid, String place) {
		super();
		this.acid = acid;
		this.place = place;
	}
	@Override
	public String toString() {
		return "Accident [acid=" + acid + ", place=" + place + "]";
	}
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	

}

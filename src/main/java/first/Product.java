package first;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	String Date;
	String p_Name;
	int cost;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String date, String p_Name, int cost) {
		super();
		Date = date;
		this.p_Name = p_Name;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [Date=" + Date + ", p_Name=" + p_Name + ", cost=" + cost + "]";
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getP_Name() {
		return p_Name;
	}
	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	

}

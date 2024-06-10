package mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int tid;
	String tname;
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	List<Student> listu;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String tname, List<Student> listu) {
		super();
		this.tname = tname;
		this.listu = listu;
	}
	public Teacher(int tid, String tname, List<Student> listu) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.listu = listu;
	}
	
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", listu=" + listu + "]";
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<Student> getListu() {
		return listu;
	}
	public void setListu(List<Student> listu) {
		this.listu = listu;
	}
}

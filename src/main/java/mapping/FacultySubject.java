package mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FacultySubject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int subid;
	String name;
	
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacultySubject(String name) {
		super();
		this.name = name;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "FacultySubject [subid=" + subid + ", name=" + name + "]";
	}
}

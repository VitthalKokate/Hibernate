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
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	int salary;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "subid")
	List<FacultySubject> subjects;
	
	public Faculty(String name, int salary, List<FacultySubject> subjects) {
		super();
		this.name = name;
		this.salary = salary;
		this.subjects = subjects;
	}

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<FacultySubject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<FacultySubject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", salary=" + salary + ", subjects=" + subjects + "]";
	}
	
}

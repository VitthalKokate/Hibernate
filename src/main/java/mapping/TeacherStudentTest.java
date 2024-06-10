package mapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TeacherStudentTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session sessio = factory.openSession();
		Transaction transaction = sessio.beginTransaction();
		
		Student jay = new Student("Jay",98);
		Student ajay = new Student("Ajay",88);
		Student raj = new Student("Raj",78);
		
		ArrayList<Student> al =new ArrayList<Student>();
		al.add(jay);
		al.add(ajay);
		al.add(raj);
		
		Teacher tka = new Teacher("TKA" ,al);
		sessio.save(tka);
		transaction.commit();
			
	}

}

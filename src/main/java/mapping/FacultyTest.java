package mapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultyTest {

	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Faculty.class);
	cfg.addAnnotatedClass(FacultySubject.class);
	
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	
	FacultySubject java = new FacultySubject("java");
	FacultySubject pythone = new FacultySubject("pythone");
	FacultySubject angular = new FacultySubject("angular");
	
	ArrayList<FacultySubject> listSub = new ArrayList<FacultySubject>();
	listSub.add(java);
	listSub.add(pythone);
	listSub.add(angular);
	
	Faculty tka = new Faculty("tka", 100000, listSub);
	
	session.save(tka);
	transaction.commit();
	}

}

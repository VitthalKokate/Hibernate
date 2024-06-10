package mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonPassportTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Passport.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session sessio = factory.openSession();
		Transaction transaction = sessio.beginTransaction();
		
		Passport p1 = new Passport(19876,"30 MArch");
		
		Person raj = new Person("Raj",786483683,"Pune",p1);
		
		sessio.save(raj);
	   transaction.commit();
	}

}

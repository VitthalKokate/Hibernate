package mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccidentClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		cfg.addAnnotatedClass(Accident.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session sessio = factory.openSession();
		Transaction transaction = sessio.beginTransaction();
		
		Accident a1 = new Accident("Delhi");
		Car maruti = new Car("Kia", a1);
		
		sessio.save(maruti);
		transaction.commit();
		
	}

}

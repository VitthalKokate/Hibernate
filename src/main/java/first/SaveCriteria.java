package first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveCriteria {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Admin.class);
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Admin second = new Admin("20-9-21", "Vijay", "Mumbai", 867344796);
		Product tv = new Product("20-9-21", "T.V", 890000);
		
		session.save(second);
		session.save(tv);
		transaction.commit();

	}

}

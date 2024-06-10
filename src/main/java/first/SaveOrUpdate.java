package first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Admin.class);
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Admin raj = new Admin("8-5-19", "Raj", "Mumbai", 8754224);
		Product pen = new Product("8-8-18", "Pen", 300000);
		
		session.saveOrUpdate(raj);
		session.saveOrUpdate(pen);
		transaction.commit();
	}

}

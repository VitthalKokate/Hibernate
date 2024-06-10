package first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Admin.class);
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session sessio = factory.openSession();
		
		Admin first = sessio.load(Admin.class,"12-6-23" );
		Product cmp = sessio.load(Product.class, "12-6-23");
		System.out.println(first);
		System.out.println(cmp);

	}

}

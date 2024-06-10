package criteria_Query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Criteria1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Admin.class);
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Admin.class);
		
		
		List<Admin> listAdmin = criteria.list();
		for (Admin admin : listAdmin) {
			System.out.println(admin);
			
		}
		
		
		
		

	}

}

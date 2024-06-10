package criteria_Query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaColumnSelect2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Admin.class);
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// Select * from Admin
		Criteria criteria = session.createCriteria(Admin.class);
		
		
		// Get all the mob-no 
		// Select MobNo from Admin 
		Projection projection1 = Projections.property("Name");
		Projection projection2 = Projections.property("MobNo");
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection1);
		projectionList.add(projection2);
		
		criteria.setProjection(projectionList);
		
		
		
		
	
		List<Object[]> listAdmin = criteria.list();
		for (Object[] data : listAdmin) {
			System.out.println(data[0]);
			System.out.println(data[1]);
			
		}
		
		
		
		

	}

}

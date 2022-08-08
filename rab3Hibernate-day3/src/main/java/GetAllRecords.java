import java.util.List;
//org.hibernate in main class
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAllRecords {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		// retrieve of all records using HQL
		String hql="from Employee";
		Query query=session.createQuery(hql);
		List<Employee> emplist=query.list();
		
		for(Employee tempa : emplist) {
			//System.out.println(tempa); //all table
			System.out.println(tempa.getName()+"   "+tempa.getSalary()); //particular table
		}
		
		
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------

	}

}
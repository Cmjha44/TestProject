
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass1 {

	public static void main(String[] args) {
		       //---------------------
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				//obtain a session
				Session session = sf.openSession();
				session.beginTransaction();
		        //-----------
				//insertion operation 
				
				Employee emp=new Employee("Shyam","India",20000);
				
				Employee emp1=new Employee("Roshan","USA",80000);
				int key=(int)session.save(emp); //returns primary key
				System.out.println("--------------------"+key);
				session.save(emp1);
				
				//persist();
				Employee emp2=new Employee("Reema","Saudi",90000);
				session.persist(emp2); //does not return any thing
				
				//-----------
				session.getTransaction().commit();
				session.close();
				//-------------

	}

}
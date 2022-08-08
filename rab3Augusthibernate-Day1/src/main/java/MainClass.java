import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//---------------------
		//Sessionfactory reading all the information related to DB configuration
		//It is creating an object . It's a factory of the session
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
        //-----------
		Employee emp=new Employee(1,"Saleem","India",60000);
		session.save(emp);
		
		Employee emp2=new Employee(2,"Rita","USA",80000);
		session.save(emp2);
		
		Employee emp3=new Employee(3,"Gita","USA",80000);
		session.save(emp3);
		
		
		
		//-----------
		session.getTransaction().commit();
		session.close();
		
		
	}

}

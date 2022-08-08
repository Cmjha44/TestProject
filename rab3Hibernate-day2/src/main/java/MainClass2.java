
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass2 {

	public static void main(String[] args) {
		//---------------------
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		//obtain a session
		Session session = sf.openSession();
		session.beginTransaction();
        //-----------
		//Retrieval operation   ( 1. load()       2. get() )
		
		//load() --If u r very sure about existence of primary key, then u have to refer load()
		//otherwise it will throw an exception
		
		Employee e1=session.load(Employee.class,1);
		System.out.println(e1);
		System.out.println(e1.getEmpiId()+" "+e1.getName()+" "+e1.getCountry());
		
		
		System.out.println("-----------------------");
		//get() -- if u r not sure about existence of primary key value, then u may refer get()
		//because it returns null
		Employee e2=session.get(Employee.class,3);
		System.out.println(e2);
		System.out.println(e2.getEmpiId()+" "+e2.getSalary());
		
		
		
		
		
		
		//-----------
		session.getTransaction().commit();
		session.close();
		//-------------
	}

}

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass3 {

	public static void main(String[] args) {
		//---------------------
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		//obtain a session
		Session session = sf.openSession();
		session.beginTransaction();
        //-----------
		/*
		//delete operation   ---- delete();
		Employee e1=session.get(Employee.class,3);
		
		if(e1!=null) {
		session.delete(e1);	
		}
		*/
		
		//update operation   
		Employee e1=session.get(Employee.class,2);
		
		if(e1!=null) {
			
			e1.setName("Mr Chandra");
			e1.setSalary(102000);
			
			}
		
		
		
		
		
		
		
		//-----------
		session.getTransaction().commit();
		session.close();
		//-------------
	}

}
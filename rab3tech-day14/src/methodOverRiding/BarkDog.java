package methodOverRiding;

public class BarkDog extends Dog{
	public void bark() {
				System.out.println("Dog can bark");
	}

	//override the method 
	//declaring a method in child class which already exist in parent class
	//that is known as method overriding
	public void run() {
		//take fully classified name
		System.out.println("Dog can run very fast");
	}
	
	public void weap() {
		System.out.println("My Dog weaps in night");
		
	}

}

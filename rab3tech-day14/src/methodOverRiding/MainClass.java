package methodOverRiding;

public class MainClass {

	
	//method overriding always happens in between two classes in whci one will be child 
	
	//and another will be parent class
	public static void main(String[] args) {
		Dog d=new BarkDog();  //up casting
		    d.run();  // Dog can walk
		    d.Laugh();   //Dog can run very fast
		   // d.bark();​
		    Dog bd= new Dog();
		    		bd.run(); //Dog can run
	}

}
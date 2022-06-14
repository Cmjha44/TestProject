package Constructor.demo;

public class Dog1 {
	String name="Tommy";
	int eyes=2;
	 int tail=1;
	 String color="blue";
	 
	 public Dog1() {
	
	//default constructor/no argument constructor
	//It is called when an object of a class is created
	 }
	 
	 
	 //parameterized constructor
	 public Dog1(String n, int e,int t,String c) {
		name=n;
		eyes=e;
		tail=t;
		color=c;
	 
	 }
	
	 
	 //these are simple methods
	 public void run() {
		System.out.println("Dog can run"); 
		 
	 }
	
	 public void bark() {
		 System.out.println("Dog can Bark"); 
	}

}

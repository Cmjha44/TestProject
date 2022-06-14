package inheritanceDemo;

public class NewDog extends Dog{
	//Newdog is a child class (sleep and wag)
	//Dog is aparent class(run+walk+bark)
	public void sleep() {
		
		System.out.println("Dog can sleep");
	}
	public void wag() {
		
		System.out.println("Dog can wag");
}
}

package polyMorphism;

public class SleepDog extends Dog{
	public void sleep() {
		System.out.println("Dog can sleep");
	}

	//method overriding
	public void run() {
		System.out.println("My Dog can not run");
	}

}

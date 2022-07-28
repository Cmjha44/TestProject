package polyMorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d;
		d=new Dog();     //Dog d=new dog();
		d.run();  // Dog can run
	    
	    //first step
	    // we have to check that can we access the particular method or not??
	    //for this purpose we have to move in left side
	    
	    //second step
	    // for definition purpose we have to move in right side
	    
	    System.out.println("-------");
	    
	    d=new BrownDog();
	    //Dog d=new BrownDog();
	    d.run(); //Dog can run very fast
	    System.out.println("-------");
	    
	    d=new SleepDog();
	    //Dog d=new SleepDog();
	    d.run();  //My Dog can not run
	    System.out.println("-------");
	    
	    d=new RedDog();
	    //Dog d=new RedDog();
	    d.run(); //Dog can run very slow
	    
	    d.run();
	}

}

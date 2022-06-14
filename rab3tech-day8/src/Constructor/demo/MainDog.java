package Constructor.demo;

public class MainDog {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		System.out.println("--**************--");
		System.out.println(d.name); //Tommy
		System.out.println(d.eyes);  //2
		System.out.println(d.tail);  //1
		System.out.println(d.color);  //Blue
		d.run(); // Dog can run
		
		System.out.println("--***************--");
		Dog1 dg=new Dog1("Jocky",5,6,"Brown");
		System.out.println(dg.name);  //Jocky
		System.out.println(dg.eyes);  //5
		System.out.println(dg.tail);  //6
		System.out.println(dg.color); //Brown
		
		System.out.println("--***************--");
		Dog1 dog=new Dog1("RadheShyam",7,9,"Black");
		System.out.println(dog.name);  //RadheShyam
		System.out.println(dog.eyes);  //7
		System.out.println(dog.tail);  //9
		System.out.println(dog.color); //black
	}

}

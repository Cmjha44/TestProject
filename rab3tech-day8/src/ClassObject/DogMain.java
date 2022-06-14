package ClassObject;

public class DogMain {

	public static void main(String[] args) {
		//Create first object
		Dog d=new Dog();
		System.out.println("------First Dog----");
		System.out.println(d.name);
		System.out.println(d.eyes);
		System.out.println(d.tail);
		System.out.println(d.color);
		//d.run();
		//d.print();
		
		Dog dg=new Dog();
		System.out.println("------Second Dog----");
		System.out.println(dg.name);
		System.out.println(dg.eyes);
		System.out.println(dg.tail);
		System.out.println(dg.color);
		//d.run();
		//d.print();

		Dog dog=new Dog();
		System.out.println("------Third Dog----");
		System.out.println(dog.name);
		System.out.println(dog.eyes);
		System.out.println(dog.tail);
		System.out.println(dog.color);
		//d.run();
		//d.print();

	}

}

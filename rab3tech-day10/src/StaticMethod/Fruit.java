package StaticMethod;


public class Fruit {
   int price=80;
   
   static void banana() {
	   
	   System.out.println("Sweet banana");
   }
	
	public static void main(String[] args) {
		Fruit fr=new Fruit();
		 // fr.banana();
		Fruit.banana();
		System.out.println(fr.price);

	}

	
}
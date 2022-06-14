package MethodOverLoading;

//method overloading takes a place in a same class
//name of method will be same, but signature of method should be different
public class Fruit {

	public void sweet() {
		// public void sweet()---> fully classified name
		System.out.println("It's very sweet");
	}

	public void sweet(int x) {
		System.out.println("Sweetless");

	}
	
	public float sweet(int x, int y) {
		
	return 0.9f;	
	}
	public static void main(String[] args) {
		Fruit fr = new Fruit();
		
		fr.sweet();
		fr.sweet(3);
		System.out.println(fr.sweet(6,10));
	
		
	}

}
package interFace;

public class MainClass {

	public static void main(String[] args) {
		Dog d= new DogUser();
		d.walk();
		d.sleep();
		
		
		CryDog cd= new DogUser();
		cd.cry();

	}

}

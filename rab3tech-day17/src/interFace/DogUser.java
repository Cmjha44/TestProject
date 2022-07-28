package interFace;

public  class DogUser implements Dog,CryDog  {
	String name= "Romy";
	int tail=1;
	
	
	
	public void walk() {
		System.out.println("Dog can walk");
	}
	

	@Override
	public void cry() {
		System.out.println("Dog can cry");
		
	}
	@Override
	public void sleep() {
		System.out.println("Dog can sleep like a baby ");	
		
	}
	
}	
	

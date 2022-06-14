package Hello;

public class HelloA {
	int x=786;	
	public HelloA() {
		System.out.println("I am default constructor 1");
	}
	
	//define instance block
	
	{
		System.out.println("I am from Instance block 1");
		x++;
		
	}
	
	//define static block
	
	static {
		
		System.out.println("I am from static block1");}
	
	public void wow() {
		System.out.println("Value of X="+x);}

		static {
			System.out.println("static block1"); }
		}
		
	



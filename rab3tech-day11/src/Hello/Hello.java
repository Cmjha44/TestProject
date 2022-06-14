package Hello;
	
public class Hello {
	int x=786;	
	public Hello() {
		System.out.println("I am default constructor");
	}
	
	//define instance block
	
	{
		System.out.println("I am from Instance block");
		x++;
		
	}
	
	//define static block
	
	static {
		
		System.out.println("I am from static block");
	}
	public void wow() {
		System.out.println("Value of X="+x);
	}
}

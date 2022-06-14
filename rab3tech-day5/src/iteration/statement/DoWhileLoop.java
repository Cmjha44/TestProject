package iteration.statement;

public class DoWhileLoop {
	
	//do while loop is -- condition is evaluated before execution of loop's body.
	//in do while --condition is evaluated after execution of loop's body
	//that's why in do while one time body section executed condition is False

	public static void main(String[] args) {
		int p=10;
		//initialization part
		do {
		System.out.println("Hello");
		
				p++;
				
		//increment/decrement
		
		}while(p<10) ;  //condition
	}

}

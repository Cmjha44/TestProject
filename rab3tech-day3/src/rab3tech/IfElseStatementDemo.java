package rab3tech;

public class IfElseStatementDemo {

	public static void main(String[] args) {
		 int num1=15;
		 int num2=10;
		 System.out.println("Value of num1:15 and num2:10. Here num1<num2=");
		 
		 System.out.println(num1<num2); //using relational operator wee learned on day 2.
		 
		 if(num1<num2) {
			 
			 //body of IF statement
			 //This will print out if the above condition is true.
			 
			 System.out.println("This will get printd if");
			 System.out.println("num1 is less than num2.");
		 }
		 else {
			 
			 //body of ELSE statement
			 // This will print out if condition in IF statement is not true
			 
			 System.out.println("Body of ELSE statement is being printeed since the condition in IF statement is not true. ");
			 
		 }
	}

}

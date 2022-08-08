package rab3tech;

public class IfStatementDemo {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		System.out.println("Value of number1:10 and num2:5. Here num1>num2=");
		System.out.println(num2>num1); //Using relational operator we learned on day 2
	
		if (num1>num2) {
			//This will print out if the condition above is true.
			System.out.println("This will get printed if ");
			System.out.println("num2 is greater than num1.");
		}
	}

}

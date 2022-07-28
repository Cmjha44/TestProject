package exceptionDemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		int div=0;
		System.out.println("before exception .....");
		div=num1/num2;  //suspicious code
		
		System.out.println("Division=="+div);
		System.out.println("Hello.....");

	}

}

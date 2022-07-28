package exceptionDemo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		int div=0;
		try {
			div=num1/num2;  //suspicious code
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());           /*getMessage()--> it will provide brief information about exception (/by zero)
			
															//e.printStackTrace();
															//detailed information about exception
															//java.lang.ArithmeticException: / by zero
															//at exceptionDemo.ExceptionDemo3.main(ExceptionDemo3.java:10)*/
		
		}
		System.out.println("Division=="+div);
		System.out.println("Namaste.....");

	}

}

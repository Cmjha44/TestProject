package exceptionDemo;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		int div=0;
		try {
			div=num1/num2;  //suspicious code
		
		}
		catch(ArithmeticException e) {
												//System.out.println(e.getMessage());
												//getMessage()--> it will provide brief information about exception (/by zero)
										
			System.out.println("first---");
			e.printStackTrace();
												// detailed information about exception
												//java.lang.ArithmeticException: / by zero
												//at exceptionDemo.ExceptionDemo3.main(ExceptionDemo3.java:10)
		}
		
		catch(Exception e) {
												//System.out.println(e.getMessage());
												//getMessage()--> it will provide brief information about exception (/by zero)			
			System.out.println("second---");
			e.printStackTrace();
												// detailed information about exception
												/*java.lang.ArithmeticException: / by zero  at exceptionDemo.ExceptionDemo4.main(ExceptionDemo4.java:10)*/
		}
		System.out.println("Division=="+div);
		System.out.println("Hello.....");
	}

}

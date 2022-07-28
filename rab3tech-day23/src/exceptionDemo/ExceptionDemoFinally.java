package exceptionDemo;

public class ExceptionDemoFinally {

	public static void main(String[] args) {
		int num1=400;
		int num2=20;
		try {
		int result=num1/num2;  //20
		System.out.println("result of num1/num2="+result);
		
		if(result==20) {
			return;				/*program is going to be terminated by default
								but before termination set of contents in finally block will be executed*/
			
		}
		}
		catch(ArithmeticException e) {
			System.out.println("got it");
			
			
		}
		
		catch(Exception e) {
			System.out.println("General");
		}
		
		finally {
			System.out.println("This is finally block");
			}
		
		System.out.println("dummy message");
		System.out.println("----end of main method---");
	}

}

package exceptionDemo;

public class ExceptionDemoFinally2 {

	public static void main(String[] args) {
		int num1=400;
		int num2=20;
		try {
		int result=num1/num2;  //20
		System.out.println("result of num1/num2=" +result);
		
		if(result==20) {
			System.exit(0);       //only in this case finally block will not be executed
			return;
			
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
		System.out.println("----Khattam---");
	}

}

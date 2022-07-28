package exceptionDemo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Hey ---Wass up?");
		
		for (int x=1; x<=10 ; x++) {
			
			System.out.println("Hi---");
		}
		int num1= 20;
		int num2=0;
				int sum=num1+num2;
		System.out.println("Sum of num1 and num2" +  sum);  //20
		
		int result=0;
	      result=num1/num2; //exception
          System.out.println(result);//0
          System.out.println("Hey---How are you");
	}

}

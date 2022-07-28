import java.util.Scanner;

public class ThrowsException {    //caller must handle this exception using try and catch block

	static private String takeInput() throws Exception {
		
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter your name--");
		String name=scanner.nextLine();
		
		if (name. equals ("Ram")) {
			Exception exception=new Exception(" ArithmeticException");
				throw exception;  // throw is used to throw an exception
	}
		return name; 
		
	
	
	}  
		public static void main(String[] args) {
		String name=null;
	
	     try {
			name=takeInput();
			
			
		}
	     catch(Exception e) {
	    	 System.out.println(e.getMessage());
	    	 return;
	}
	      /* out of try catch block*/
	     System.out.println("Name=="+name);
	     

}
}
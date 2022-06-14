package selectin.statement;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		// Define variable
		int age=2;
		
		switch(age) {
		
		default:
			System.out.println("none of case matched");
			break;
			
		
		case 1:
			System.out.println("case 1");
			break;
			
		case 2:
			System.out.println("case 2");
			break;
			
		case 3:
			System.out.println("case 3");
			break;
			
		case 4:
			System.out.println("case 4");
			break;
			
		case 5:
			System.out.println("case 5");
			break;
			
			
		}
		System.out.println("out of switch case");
	}

}

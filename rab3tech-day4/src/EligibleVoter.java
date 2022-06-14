import java.util.Scanner;

public class EligibleVoter {

	public static void main(String[] args) {
		String name;
		int  age;
		Scanner scan=new Scanner(System.in);
		System.out.println("input your full name: ");
		name=scan.nextLine();
		System.out.println("input your age: ");
		age= scan.nextInt();
		if(age>=18) {
			System.out.println("you are eligible to vote");
			
		}
		else {
			System.out.println("You are not eligible");
			
		}
	}

}

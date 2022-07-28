


import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter your name--");
		String name=scanner.nextLine();
		try
		{
		if (name. equals ("Chandra Jha")) {
			Exception exception=new Exception("Chandra Jha is allowed.");
				throw exception;
				}
				}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Hello... I am from catch block");
		}
		System.out.println("Heloo....."+name);
	}

}

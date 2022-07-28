package stringDemo;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter text please--");
		String str=scanner.nextLine();
		 if(str.equalsIgnoreCase("Gulam Ali"))  {
			System.out.println("Hey---You are my friend");
		}
		
		else {   System.out.println("Sorry---You are not in the list");
		}
}}

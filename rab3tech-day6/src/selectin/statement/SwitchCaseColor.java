package selectin.statement;

import java.util.Scanner;

public class SwitchCaseColor {

	public static void main(String[] args) {
		//define variable
				char ch;
				
				Scanner  sc =new Scanner(System.in);
				System.out.println("Enter your color code;");
				ch=sc.next().charAt(0);
				
				switch(ch) {
				
				case 'y':
						System.out.println("This is color Yellow");
						break;
						
				case 'g':
					System.out.println("This is color green");
					break;
				case 'b':
					System.out.println("This is color Blue");
					break;
				case 'p':
					System.out.println("This is color Purple");
					break;
					
				case 'm':
					System.out.println("This is color Maroon");
					break;
					
				
				}
				

			}

		}

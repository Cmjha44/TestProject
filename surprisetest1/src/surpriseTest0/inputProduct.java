package surpriseTest0;

import java.util.Scanner;

public class inputProduct {
	public double mul(double x, double y) {
		return x*y;
	}

	public static void main(String[] args) {
		double num1;
		double num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1=sc.nextDouble();
		System.out.print("Enter the second number: ");
		num2=sc.nextDouble();
		inputProduct ip=new inputProduct();
		System.out.println("The result of multiplication of two given numbers: "+ ip.mul(num1,num2));
		
	}}

package com.bridgelabz.dayone;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.println("Numbers before swapping: "+num1+" "+num2);
	        num1=num1+num2;
	        num2=num1-num2;
	        num1=num1-num2;
	        System.out.println("Numbers before swapping: "+num1+" "+num2);
	        
	        

	}

}

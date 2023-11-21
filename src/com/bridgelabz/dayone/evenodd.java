package com.bridgelabz.dayone;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");
        int n = scanner.nextInt();
        if(n%2 ==0) {
        	System.out.println("Number is even");
        }
        else {
        	System.out.println("Number is odd");
        }

	}

}

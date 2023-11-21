package com.bridgelabz.dayone;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");
        int n = scanner.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++) {
        	if(n%i ==0 ) {
        		count++;
        	}
        }
        if(count ==0) {
        	System.out.println("Number is prime");
        }
        else {
        	System.out.println("Number is not prime");
        }

	}
}

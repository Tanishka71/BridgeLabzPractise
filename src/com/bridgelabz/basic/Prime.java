package com.bridgelabz.basic;
import java.util.*;
public class Prime {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	int count=0;
	for(int i=2;i<=n/2;i++) {
	if(n%i==0) {
		count++;
	}
	}
	if(count==0) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("Not a prime number");
	}
}
}

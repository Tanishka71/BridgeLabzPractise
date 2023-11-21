package com.bridgelabz.dayone;
import java.util.Scanner;

public class quotient {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}

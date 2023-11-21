package com.bridgelabz.dayone;

import java.util.Scanner;

public class Harmonic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (N should be greater than 0): ");
        int N = scanner.nextInt();

        if (N != 0) {
            double harmonicNumber = 0;

            for (int i = 1; i <= N; i++) {
                harmonicNumber += 1.0 / i;
            }

            System.out.println("The " + N + "th Harmonic Number is: " + harmonicNumber);
        } else {
            System.out.println("Please enter a valid value for N (N should be greater than 0).");
        }

        scanner.close();
    }
}

package com.bridgelabz.dayone;

import java.util.Scanner;

public class PrimeFactor{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + " are: ");
        printPrimeFactors(number);

        scanner.close();
    }

    private static void printPrimeFactors(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}


package com.bridgelabz.dayone;
import java.util.*;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (4 digits): ");
        int year = scanner.nextInt();

        if (year >= 1000 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Invalid input. Please enter a 4-digit year.");
        }

        scanner.close();
    }
}

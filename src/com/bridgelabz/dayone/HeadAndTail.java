package com.bridgelabz.dayone;


import java.util.Scanner;

public class HeadAndTail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numberOfFlips = scanner.nextInt();

        if (numberOfFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
        } else {
            int headsCount = 0;
            int tailsCount = 0;

            for (int i = 0; i < numberOfFlips; i++) {
                double randomValue = Math.random();
                if (randomValue < 0.5) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
            }

            double percentageHeads = (double) headsCount / numberOfFlips * 100;
            double percentageTails = (double) tailsCount / numberOfFlips * 100;

            System.out.println("Number of flips: " + numberOfFlips);
            System.out.println("Heads count: " + headsCount + " (" + percentageHeads + "%)");
            System.out.println("Tails count: " + tailsCount + " (" + percentageTails + "%)");
        }

        scanner.close();
    }
}
```
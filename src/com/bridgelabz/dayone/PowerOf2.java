package com.bridgelabz.dayone;

public class PowerOf2 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2 <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N >= 0 && N < 31) {
            System.out.println("Powers of 2 up to 2^" + N + ":");
            for (int i = 0; i <= N; i++) {
                int result = 1;
                for (int j = 0; j < i; j++) {
                    result *= 2;
                }
                System.out.println("2^" + i + " = " + result);
            }
        } else {
            System.out.println("Please enter a valid value for N (0 <= N < 31).");
        }
    }
}

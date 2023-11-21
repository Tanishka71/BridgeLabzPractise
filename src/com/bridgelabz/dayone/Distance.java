package com.bridgelabz.dayone;

public class Distance {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Distance <x> <y>");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(x * x + y * y);

        System.out.println("Euclidean distance from the point (" + x + ", " + y + ") to the origin (0, 0): " + distance);
    }
}


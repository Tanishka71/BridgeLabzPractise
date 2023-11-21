package com.bridgelabz.dayone;

public class Quadratic {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Quadratic <a> <b> <c>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

      
        double delta = b * b - 4 * a * c;

        // Check if roots are real
        if (delta >= 0) {
            // Calculate the roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1 of x: " + root1);
            System.out.println("Root 2 of x: " + root2);
        } else {
            System.out.println("The roots are complex. No real solutions.");
        }
    }
}

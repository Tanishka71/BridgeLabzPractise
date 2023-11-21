package com.bridgelabz.dayone;

import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TwoDArrayLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int cols = scanner.nextInt();

        int[][] array = readArray(rows, cols);

        System.out.println("Entered 2D Array:");
        printArray(array);
    }

    private static int[][] readArray(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    private static void printArray(int[][] array) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out), true);

        for (int[] row : array) {
            for (int element : row) {
                writer.print(element + " ");
            }
            writer.println();
        }
    }
}


package com.bridgelabz.Algorithm;
	import java.util.Scanner;

	public class BubbleSort {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        bubbleSort(array);

	        System.out.println("Sorted array using Bubble Sort:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }

	    private static void bubbleSort(int[] array) {
	        int n = array.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	
}

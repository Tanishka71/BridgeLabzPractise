package com.bridgelabz.Algorithm;

import java.util.Scanner;

public class Binary {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the sorted array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter the elements of the sorted array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        int left = 0;
	        int right = n - 1;
	        int index = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                index = mid;
	                break;
	            } else if (array[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        if (index != -1) {
	            System.out.println(target + " is present at index " + index + ".");
	        } else {
	            System.out.println(target + " is not present in the array.");
	        }

	        scanner.close();
	    }
}
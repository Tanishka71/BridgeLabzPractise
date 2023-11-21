package com.bridgelabz.dayone;

	import java.util.Arrays;
	import java.util.Scanner;

	public class ThreeSumZero {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements (N): ");
	        int N = scanner.nextInt();

	        int[] array = new int[N];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < N; i++) {
	            array[i] = scanner.nextInt();
	        }

	        findTriplet(array);
	    }

	    private static void findTriplet(int[] array) {
	        Arrays.sort(array);
	        int count = 0;

	        for (int i = 0; i < array.length - 2; i++) {
	            int left = i + 1;
	            int right = array.length - 1;
	            int targetSum = -array[i];

	            while (left < right) {
	                int currentSum = array[left] + array[right];

	                if (currentSum == targetSum) {
	                    System.out.println("Triplet: " + array[i] + " " + array[left] + " " + array[right]);
	                    count++;
	                    left++;
	                    right--;
	                } else if (currentSum < targetSum) {
	                    left++;
	                } else {
	                    right--;
	                }
	            }
	        }

	        System.out.println("Number of distinct triplets with sum zero: " + count);
	    }
	}



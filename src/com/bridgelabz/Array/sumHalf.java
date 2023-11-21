package com.bridgelabz.Array;

import java.util.Scanner;

public class sumHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        int l=n-1,sum=0,sum2=0;
        for(int i=0;i<=n/2;i++) {
        	sum +=array[i];
        	sum2 +=array[l];
        	l--;
        }
        if(sum ==sum2) {
        	System.out.println("sum is equal");
        }
        else {
        	System.out.println("Sum is not equal.");
        }
    }
}

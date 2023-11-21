package com.bridgelabz.dayone;

import java.util.Scanner;

public class vowel {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a single alphabet: ");
	        char ch = scanner.next().charAt(0);

	        scanner.close();

	        ch = Character.toLowerCase(ch);

	        if (Character.isLetter(ch)) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch + " is a vowel.");
	            } else {
	                System.out.println(ch + " is a consonant.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a valid alphabet.");
	        }
	    }
	}



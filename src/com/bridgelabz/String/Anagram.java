package com.bridgelabz.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        checkAnagrams(str1, str2);
    }

    public static void checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagram");
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
            	System.out.println("Strings are not anagram");
            }
        }

        System.out.println("Strings are anagram");
    }
}

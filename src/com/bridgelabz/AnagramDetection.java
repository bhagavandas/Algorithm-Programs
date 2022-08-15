package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	public static void main(String[] args) {
		System.out.println("Welcome to Anagram Detection");

		detectAnagram();

	}

	public static void detectAnagram() {

		Scanner sc = new Scanner(System.in);
		System.out.println("String name1: ");
		String str1 = sc.next();
		System.out.println("String name2: ");
		String str2 = sc.next();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// check if length is same
		if (str1.length() == str2.length()) {

			// convert strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}
	}

}

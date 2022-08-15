package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindingPrimeNumberInRange {

	static int first = 1, last = 1000;

	public static void findPrimeNumber() {

		int res = 0, i, j;

		System.out.println("The prime numbers in between the range are :");

		for (i = first; i <= last; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) { // 1,3... if modulo not equals 0, res will be 1 and it prints
					res = 0;
					break;
				} else {
					res = 1;
				}
			}
			if (res == 1) {
				System.out.println(i);
			}
		}

	}

	static boolean checkPalPrimeNumber(int number) {

		
		int temp, rem, i;
		int count = 0;
		int sum = 0;

		
		temp = number;//1000
		
		// use for loop check whether number is prime or not
		for (i = 1; i <= temp; i++) {
			if (temp % i == 0) {
				count++; // increment counter when the reminder is 0
				
			}
		}
		

		// use while loop to check whether the number is palindrome or not
		while (number > 0) {
			//System.out.println("s: " + number);
			// get last digit of the number
			rem = number % 10;//1/10=1
			
			
			sum = sum * 10 + rem;//
			number = number / 10;
			
			
		}

		// check whether the number is palindrome and Prime or not
		if (temp == sum && count == 2) //sum
			return true;
		else
			return false;
	}
	
	
	public static void main(String args[]) {

		findPrimeNumber();
		
		System.out.println("The Palindrome Prime Numbers are:");
		for (int i = first; i <= last; i++) {
			if (checkPalPrimeNumber(i))
				System.out.println(i);
		}

	}

}

package com.bridgelabz;

import java.util.Scanner;

public class FindingPrimeNumberInRange {

	public static void main(String args[]) {

		findPrimeNumber();
	}

	public static void findPrimeNumber() {
		
		int first = 1, last = 1000, res = 0, i, j;
		
		System.out.println("The prime numbers in between the range are :");
		for (i = first; i <= last; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
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

}

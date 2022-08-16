package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindPrimeNumbersInRange {

	public static void main(String args[]) {
		findPrimeNumbers();
		
	}

	public static void findPrimeNumbers() {
//	        Scanner in = new Scanner(System.in);
//	        System.out.print("Enter number of rows (m): ");
		int m = 6;
//	        System.out.print("Enter number of columns (n): ");
		int n = 25;

		int arr[][] = new int[m][n];
		int r = 0, c = 0;
		int total = m * n;
		int count = 0;
		for (int i = 2; count < total; i++) {

			int div = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					div++;
				}
			}

			if (div == 2) {
				arr[r][c++] = i;
				count++;
				if (c == n) {
					r++;
					c = 0;
				}
			}

		}

		System.out.println("Prime Numbers Array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	
	
}


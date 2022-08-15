package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {

	public static String[] sortInsertion(String array[], int x) {
		String temp = "";
		for (int i = 0; i < x; i++) {
			for (int j = i + 1; j < x; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		String[] arr = { "JAVA", "JAVASCRIPT", "C++", "PYTHON", "C" , " n "};
		int count = 0;
		String sortedArray[] = sortInsertion(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
}
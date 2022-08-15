package com.bridgelabz;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) { // i=1
			for (int j = 1; j < (n - i); j++) { //j<7-1=6
				if (arr[j - 1] > arr[j]) { //arr[1-1] = 3 > arr[1]=60
					//arr[0]= 3 > arr[1]=60
					// swaping the elements
					temp = arr[j - 1]; //arr[0]=3
					arr[j - 1] = arr[j];// arr[0]=arr[1]=60
					arr[j] = temp;//arr[1]=3,35,2
				}

			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Sorted list: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
//	public static void mergeSortArray() {
//		String[] array1 = {"a","u","i","e","o"};
//		String[] array2 = {"b","c","d","f","g"};
//		
//		Array.sort(array1);

	// }

	private ArrayList<String> strList;

	
	// Constructor
	public MergeSort(ArrayList<String> input) {
		strList = input;
	}

	
	
	public void sort() {
		strList = mergeSort(strList);
	}

	
	
	public ArrayList<String> mergeSort(ArrayList<String> whole) {

		ArrayList<String> left = new ArrayList<String>();
		ArrayList<String> right = new ArrayList<String>();
		int center;

		if (whole.size() == 1) {
			return whole;
		} else {
			center = whole.size() / 2;
			// copy the left half of whole into the left.
			for (int i = 0; i < center; i++) {
				left.add(whole.get(i));
			}

			// copy the right half of whole into the new arraylist.
			for (int i = center; i < whole.size(); i++) {
				right.add(whole.get(i));
			}

			// Sort the left and right halves of the arraylist.
			left = mergeSort(left);
			right = mergeSort(right);

			// Merge the results back together.
			merge(left, right, whole);
		}
		return whole;
	}

	
	
	private void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> whole) {
		int leftIndex = 0;
		int rightIndex = 0;
		int wholeIndex = 0;

		while (leftIndex < left.size() && rightIndex < right.size()) {
			//System.out.println(right.size());
			if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
				whole.set(wholeIndex, left.get(leftIndex));
				leftIndex++;
			} else {
				whole.set(wholeIndex, right.get(rightIndex));
				rightIndex++;
			}
			wholeIndex++;
		}

		ArrayList<String> rest;
		int restIndex;
		if (leftIndex >= left.size()) {
			// The left ArrayList has been use up...
			rest = right;
			restIndex = rightIndex;
		} else {
			// The right ArrayList has been used up...
			rest = left;
			restIndex = leftIndex;
		}

		// Copy the rest of whichever ArrayList (left or right) was not used up.
		for (int i = restIndex; i < rest.size(); i++) {
			whole.set(wholeIndex, rest.get(i));
			wholeIndex++;
		}
	}

	
	
	public void show() {
		System.out.println("Sorted:");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}

	
	
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your text, type done for exit:");
		String string = sc.nextLine();

		while (!string.equals("done")) {
			input.add(string);
			string = sc.nextLine();
		}
		System.out.println("************************");
		MergeSort test = new MergeSort(input);
		test.sort();
		test.show();
	}

}

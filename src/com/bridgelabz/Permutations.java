package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void Iterative(String str) {
		
		if (str == null || str.length() == 0) {
			return;
		}

		List<String> partial = new ArrayList<>();

		partial.add(String.valueOf(str.charAt(0)));

		for (int i = 1; i < str.length(); i++) // i=1<3 condition is true. so it is iterating upto it becomes false
		{

			for (int j = partial.size() - 1; j >= 0; j--) // j=6-1=5, 5>0, condition true
			{

				String s = partial.remove(j);

				for (int k = 0; k <= s.length(); k++) {

					partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));

				}
			}
		}
		
		System.out.println("partial: " + partial);

	}

	private static void Recursive(String candidate, String remaining) {

		if (remaining == null) {
			return;
		}

		if (remaining.length() == 0) {
			System.out.println(candidate);
			
		}

		for (int i = 0; i < remaining.length(); i++) {
			String newCandidate = candidate + remaining.charAt(i);
			System.out.println("n: " + newCandidate);
			System.out.println("c: " + candidate);
			String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

			Recursive(newCandidate, newRemaining);
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		String str1 = "ABC";
		
		String[] arr = new String[3];
		
		Iterative(str);
		Recursive("", str1);
		
		
		
	}			 
		 }
		
	


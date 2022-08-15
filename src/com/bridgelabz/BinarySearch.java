package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		   int i;  

		   System.out.println("Enter number of words you wish to input: ");
		   int n=sc.nextInt();

		   String[] words= new String[n];

		   System.out.println("Enter the words");
		   for ( i = 0; i < words.length; i++)
		   {
		       System.out.print("WORD " + (i + 1) + ": ");
		       words[i] = sc.next();
		   }

		   System.out.println("enter the word you want to search for");
		   String word=sc.next();

		   Arrays.sort(words);


		   Arrays.binarySearch(words,word);
		  
		   for ( i = 0; i < n; i++) {
		  
		   if( word.equals(words[i])) 
		   System.out.println(word + " found!");
		   else
			   System.out.println("not found");
		   }
	}
		

}

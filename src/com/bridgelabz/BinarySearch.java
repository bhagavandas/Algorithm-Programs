package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	 static int binarySearch(String[] words, String word)
	    {
	        int left = 0, right = words.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            //System.out.println(mid);
	            // it compares with words in array
	            int res = word.compareTo(words[mid]);
	           // System.out.println(words[mid]);
	            // Check if x is present at mid
	            if (res == 0)
	                return mid;
	 
	            // If x greater, ignore left half
	            if (res > 0)
	                left = mid + 1;
	 	           
	            else
	                right = mid - 1;
	        }
	 
	        return -1;
	    }
	 
	    // Driver method to test above
	    public static void main(String []args)
	    {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	 String[] words = { "java", "C", "C++", "Javascript"};
	    	 System.out.println("Enter the word you want to search for :");
	         String word = sc.next();
	         
	         Arrays.sort(words);
	         
	         int result = binarySearch(words, word);
	  
	         if (result == -1)
	             System.out.println("Element not present");
	         else
	             System.out.println("Element found at "
	                               + "index " + result);
	     }
}

package com.bridgelabz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeChecker {
	 public static void main(String[] args) {  
		   //Creating Deque and adding elements  
		   Deque<String> deque = new ArrayDeque<String>();  
		
		   Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a string as an input to check whether it is palindrome or not");
	        String input= scanner.nextLine();
	        
	          
	        //checking whether palindrome or not
	        if(isPalindrome(input))
	        {
	        	 deque.add(input); 
	            System.out.println(input+" is a palindrome string");
	            System.out.println(deque); 
	        }
	        else
	        {
	            System.out.println(input+" is not a palindrome string");
	        }
	        
	       
	    }
	 
	    public static boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;
	        
	        while(left < right)
	        {
	        	 //System.out.println(right); 
	            if(str.charAt(left) != str.charAt(right)) //first char != last char
	            {
	            	
	                return false;
	            }
	            left++;
	            right--;
	           
	        }
	        return true;
		   }  
	   
	   
}

package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class OrderedList<E> {
	
	public static void createLinkedList() {
		Scanner input = new Scanner(System.in);
		//LinkedList list = new LinkedList();
		 LinkedList<Integer> list = new LinkedList<>();
		 
		 for (int j = 1; j<= 100; j++ ) {
			 list.add(j);
			 
		 }
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
		System.out.println("Existing list: " + list);
		
		
		 System.out.println("Enter the number you want to search: ");
		 int element = input.nextInt();
	 // int element = 4;
	  
      // Initializing the answer to the index -1
      int ans = -1;

      // Traversing through the Linked List
      for (int i = 0; i < list.size(); i++) {

          int number = list.get(i);

          // Checking if the extracted element is equal to
          // the element to be searched
          if (number == element) {

              // Assigning the index of the
              // element to answer
              ans = i;
              break;
          }
      }
      // Checking if the element is present in the Linked
      // List
      if (ans == -1) {
    	 
          list.add(element);
          
          System.out.println("Updated list: " + list);
      }
      else {
          System.out.println(
              "Element found in Linked List at " + ans);
      }
  }
	
	public static void main(String[] args) {
		createLinkedList();
		
	}
}

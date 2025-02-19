/* Write a program using ArrayDeque to add book names and add,delete the values from both ends of que. */

package com.tasks;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// Creating an ArrayDeque to store book names
		ArrayDeque<String> ad = new ArrayDeque<String>();
		
		// Adding books to the deque
		ad.addFirst("Harry Potter");
		ad.addLast("Rich Dad Poor Dad");
		ad.addFirst("The Alchemist");
		ad.addLast("The Lord of the Rings");

		 // Printing the book list
		System.out.println("Books in the queue : "+ad);
		
		// Removing books from both ends
		ad.removeFirst();
		ad.removeLast();
		
		// Printing the updated book list
		System.out.println("After removing from the both ends : "+ad);

	}

}

/*

Output:
Books in the queue : [The Alchemist, Harry Potter, Rich Dad Poor Dad, The Lord of the Rings]
After removing from the both ends : [Harry Potter, Rich Dad Poor Dad]

*/

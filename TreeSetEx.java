/* Write a program using TreeSet insert Integer values and print them. */

package com.tasks;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// Creating a TreeSet to store Integer values
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		// Adding integer values to the TreeSet
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		
		// Printing the TreeSet (sorted order)
		System.out.println("Treeset Elements : "+ts);

	}

}


/*

Output:
Treeset Elements : [10, 20, 30, 40, 50, 60]

*/
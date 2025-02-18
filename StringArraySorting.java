/* Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]. */

package com.tasks;

import java.util.Arrays;// Importing the Arrays class for sorting

public class StringArraySorting {

	public static void main(String[] args) {
		// Declare and initialize the array with given strings
		String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"}; 
		
		// Sort and print in descending order
		Arrays.sort(letters);
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i] + " ");
		}

	}

}

/*

 Output:
 Z Y X W D C B A
 
*/
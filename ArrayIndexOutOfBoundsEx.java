/* Write a program using exception handling to handle array index out of bounds. */

package com.tasks;

public class ArrayIndexOutOfBoundsEx {
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};

	        try {
	            // to access an index (out of bounds)
	            System.out.println("Element at index 10: " + numbers[10]);
	        }
	        // Catch block to handle ArrayIndexOutOfBoundsException
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index is out of bounds.");
	        }

	        System.out.println("Program continues after handling exception.");
	    }
}


/*
 
Output:  
Error: Array index is out of bounds.
Program continues after handling exception.
  
*/

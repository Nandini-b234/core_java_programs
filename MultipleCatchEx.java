/* Write a program demonstrating multiple catch statements and finally block. */

package com.tasks;

public class MultipleCatchEx {

	 public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            int result = numbers[5]; // ArrayIndexOutOfBoundsException
	            int division = 10 / 0;   // ArithmeticException
	        }
	        // Catch block for ArrayIndexOutOfBoundsException
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds.");
	        }
	        // Catch block for ArithmeticException
	        catch (ArithmeticException e) {
	            System.out.println("Error: Arithmetic exception occurred (divide by zero).");
	        }
	        // Catch block for general Exception (catch any other exceptions)
	        catch (Exception e) {
	            System.out.println("Error: An unexpected error occurred.");
	        }
	        // Finally block will always execute
	        finally {
	            System.out.println("This block executes whether exception occurs or not.");
	        }

	        System.out.println("Program continues after exception handling.");
	    }
}


/*

Output:
Error: Array index out of bounds.
This block executes whether exception occurs or not.
Program continues after exception handling.

*/
 
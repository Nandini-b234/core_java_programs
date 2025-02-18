/* Write a program demonstrating  Exception handling using try catch for Arithmatic Exception. */

package com.tasks;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;  // This will cause an ArithmeticException
        
        try {
            // Trying to divide by zero
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

/*

Output:
Error: Cannot divide by zero.
Program continues after exception handling.

*/
 
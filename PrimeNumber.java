/* Write a program to check given number is prime number or not. */

package com.tasks;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Creating a Scanner object 
		Scanner s = new Scanner(System.in);
				
		//taking input (number) from user
		System.out.println("Enter a number: ");
		int num = s.nextInt();
				
		boolean isPrime = true;
				
		// Prime numbers are greater than 1. Numbers <= 1 are not prime.
		if(num <= 1) {
			isPrime = false;
		}
		else {
			 // Loop to check divisibility
			for(int i=2; i<=num/2 ; i++) {
				// If num is divisible by i, it's not a prime number
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
				
		 // Output the result 		
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		
		// Closing the Scanner
		s.close();		
	}

}


/*

1. Enter a number: 
   7
   7 is a prime number  
 
2. Enter a number: 
   18
   18 is not a prime number
 
*/
 
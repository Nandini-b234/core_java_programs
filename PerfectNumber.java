/* Write a java program to check given number is perfect number or not. */

package com.tasks;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Creating a Scanner object 
		Scanner s = new Scanner(System.in);
		
		//taking input (number) from user
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		
		int sum=0;
		
		// Find the sum of divisors of the number
		for(int i=1; i<=num/2 ; i++ ) {
			if(num % i == 0) {
				sum += i ;
			}
		}
		
		// Check if the number is a perfect number
		if(sum == num) {
			System.out.println(num+ " is a perfect number");
		}
		else {
			System.out.println(num+ " is not a perfect number");
		}
		
		// Closing the Scanner
		s.close();
	}

}

/*
 
1. Enter a number: 
   6
   6 is a perfect number

2.Enter a number: 
  24
  24 is not a perfect number

*/

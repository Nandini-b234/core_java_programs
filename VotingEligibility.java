/* Write java program to check  candidate eligible for voting or not. */

package com.tasks;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// Creating a Scanner object to read input from the console
		Scanner s = new Scanner(System.in);
		
		// take input(age) from user
		System.out.println("Enter age: ");
		int age = s.nextInt();
		
		// Checking if the user's age is 18 or above
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		
		else {
			System.out.println("You are not eligible to vote");
		}
		
		 // Closing the Scanner
		s.close();
	}

}

/*
output:

1.Enter age: 
  20
  You are eligible to vote
 
 
2.Enter age: 
  15
  You are not eligible to vote

 */

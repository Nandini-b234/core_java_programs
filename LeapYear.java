/* Write a program to check leap year using if else. How to check whether a given year is a leap year or not */

package com.tasks;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Creating a Scanner object 
		Scanner s = new Scanner(System.in);
		
		//taking input (year) from user
		System.out.println("Enter year: ");
		int year = s.nextInt();
		
		// Checking if the entered year is a leap year
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+" is leap year.");
		}
		else {
			System.out.println(year+" is not leap year.");
		}
		
		// Closing the Scanner
		s.close();
	}

}

/*
 
1.Enter year: 
  2020
  2020 is leap year.

2.Enter year: 
  2013
  2013 is not leap year.
  
 */
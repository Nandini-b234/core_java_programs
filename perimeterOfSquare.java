/* write a program to find the perimeter of the square */

package com.tasks;

import java.util.Scanner;

public class perimeterOfSquare {

	public static void main(String[] args) {
		// Creating a Scanner object
		Scanner sc = new Scanner(System.in);
		
		//length of one side of the square
		System.out.println("Enter the side of square: ");
		int sides = sc.nextInt();
		
		// // Calculating the perimeter of the square
		int perimeter = 4 * sides;
		
		 // Displaying the calculated perimeter
		System.out.println("Perimeter of square: "+perimeter);
		
		  // Closing the Scanner object
		sc.close();
	}

}

/*
 
Enter the side of square: 
5
Perimeter of square: 20 
 
 */

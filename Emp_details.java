/*WAP to take employee id, name, address and salary from user and display on the screen. */

package com.tasks;

import java.util.Scanner;

public class Emp_details {

	public static void main(String[] args) {
		 // Creating a Scanner object to read input from the console
		Scanner s = new Scanner(System.in);
		
		//Take employee details from user
		System.out.println("Enter employee id: ");
		int id = s.nextInt();
		
		s.nextLine();
		System.out.println("Enter employee name: ");
		String name = s.nextLine();
		
		System.out.println("Enter employee address: ");
		String address = s.nextLine();
		
		System.out.println("Enter employee salary: ");
		int salary = s.nextInt();
		
		// Displaying the entered employee details
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee address: "+address);
		System.out.println("employee salary: "+salary);
		
		// Closing the Scanner
		s.close();
	}

}

/* 
Output: 

Enter employee id: 
101
Enter employee name: 
Nandini
Enter employee address: 
Bhadrawati peth , Solapur
Enter employee salary: 
35000

Employee id: 101
Employee name: Nandini
Employee address: Bhadrawati peth , Solapur
employee salary: 35000

*/

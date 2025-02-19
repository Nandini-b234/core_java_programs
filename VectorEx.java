/* Write a program using Vector to store the list of students details and print the details. */

package com.tasks;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Creating a Vector to store student details
		Vector<String> v = new Vector<String>();
		
		// Adding student details
		v.add("Name : Selena , Age : 21 , Branch : Computer science");
		v.add("Name : Justin , Age : 25 , Branch : Civil ");
		v.add("Name : Zayn , Age : 23 , Branch : Electronics ");
		v.add("Name : Arina , Age : 22 , Branch : Electrical ");
		v.add("Name : Taylor , Age : 23 , Branch : Information Technology");
		
		// Printing student details
		System.out.println("Student Details: ");
		for(String students : v) {
			System.out.println(students);
		}
	}

}

/*

Output:
Student Details: 
Name : Selena , Age : 21 , Branch : Computer science
Name : Justin , Age : 25 , Branch : Civil 
Name : Zayn , Age : 23 , Branch : Electronics 
Name : Arina , Age : 22 , Branch : Electrical 
Name : Taylor , Age : 23 , Branch : Information Technology

*/

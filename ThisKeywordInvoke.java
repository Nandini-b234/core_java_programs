/* Write java program to invoke current class method using this keyword */

package com.tasks;

class Example{
	 // Method to be invoked
	void display() {
		System.out.println("Method of current class is invoked.");
	}
	
	// Method that invokes the current class method 
	void call() {  	
		//to call the display method of the current class
		this.display();
	}
}

public class ThisKeywordInvoke {

	public static void main(String[] args) {
		 // Creating an object
		Example obj = new Example();
		
		obj.call();
	}

}


/*

Method of current class is invoked.

*/
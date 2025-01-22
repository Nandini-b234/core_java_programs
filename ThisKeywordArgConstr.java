/* Write a Java Program  to pass  this keyword as argument in the constructor call */

package com.tasks;

class A{
	
	// Constructor of Class A
	A(B obj){
		System.out.println("class A constructor called");
		System.out.println("Message from Class B: " + obj.msg);
	}
	
}

class B{
	String msg;
	
	// Constructor of Class B
	B(String msg){
		this.msg = msg;
		// Passing 'this' as an argument to the constructor of Class A
		A a= new A(this);
	}
}

public class ThisKeywordArgConstr {

	public static void main(String[] args) {
		// Creating object of Class B
		B b = new B("Hello from class B");
	}

}


/*

class A constructor called
Message from Class B: Hello from class B

*/

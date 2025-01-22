/* Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
 Create a child class called "Student" that inherits from Person and has an additional attribute called "grade"
 and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods. 
*/


package com.tasks;

class Person {
	//Attributes
	String name;
    int age;

    //method to display information
    void speak() {
        System.out.println("My name is " + name + ". I am " + age + " years old.");
    }
}

class Student extends Person {
    //Additional attribute
	String grade;

	//method to display information
    void study() {
        System.out.println("I am studying in grade " + grade );
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
    	// Creating an object
        Student obj = new Student();

        // Assigning values to attributes
        obj.name = "Nandini";
        obj.age = 20;
        obj.grade = "A";

        // Calling methods
        obj.speak(); 
        obj.study(); 
    }
}

/*

My name is Nandini. I am 20 years old.
I am studying in grade A

*/
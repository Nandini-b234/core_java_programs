/* Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive".
 Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" 
 and a method called "honk".Create an object of the Car class and call both the "drive" and "honk" methods. 
*/

package com.tasks;

class Vehicle {
    // Attributes
    String brand;  
    String model;   
    int year;       
    
    // Method to display
    void drive() {
        System.out.println("Driving the " + brand + " " + model + " (" + year + ").");
    }
}

class Car extends Vehicle {
    //Additional attribute
    String color;   

    // Method to display
    void honk() {
        System.out.println("Honking the horn of the " + color + ".");
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        // Create an object 
    	Car car = new Car();

    	 // Assigning values to attributes
        car.brand = "Toyota";     
        car.model = "Corolla";   
        car.year = 2022;          
        car.color = "Blue";       
        
        // Call methods
        car.drive();  
        car.honk();   
    }
}

/*

Driving the Toyota Corolla (2022).
Honking the horn of the Blue.

*/
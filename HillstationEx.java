/* 
 Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
 Subclasses extend the superclass and override its location() and famousFor() method.
 i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. 
 As it refers to the base class object and the base class method overrides the superclass method;
 the base class method is invoked at runtime. ii.call the location() and famousFor() method by the 
 all subclass’,and print accordingly.
*/

package com.tasks;

//Superclass HillStations
class HillStations{
	
	// Method for location
	public void location() {
		System.out.println("Hill Station");
	}
	
	// Method for famous for
	public void famousFor() {
		System.out.println("Famous for its scenary");
	}
}

//Subclass Manali
class Manali extends HillStations{
	public void location() {
		System.out.println("Manali is located in Himachal Pradesh.");
	}
	public void famousFor() {
		 System.out.println("Manali is famous for snowfall.");
	}
}

//Subclass Mussoorie
class Mussoorie extends HillStations{
	public void location() {
		 System.out.println("Mussoorie is located in Uttarakhand.");
	}
	public void famousFor() {
		 System.out.println("Mussoorie is famous for waterfalls.");
	}
}

//Subclass Gulmarg
class Gulmarg extends HillStations{
	public void location() {
		System.out.println("Gulmarg is located in Jammu and Kashmir.");
	}
	public void famousFor() {
		System.out.println("Gulmarg is famous for cable cars.");
	}
}

public class HillstationEx {

	public static void main(String[] args) {
		
		// Calling methods using Parent class reference
		HillStations hs;
		System.out.println("Calling methods using Parent class reference:");

		hs = new Manali();
		hs.location();
		hs.famousFor();
		
		hs = new Mussoorie();
		hs.location();
		hs.famousFor();
	
		hs = new Gulmarg();
		hs.location();
		hs.famousFor();
	
		 // Calling methods using subclass objects directly
		System.out.println("\nCalling methods using Subclass objects:");
		
		Manali m = new Manali();
		m.location();
		m.famousFor();
		
		Mussoorie ms = new Mussoorie();
		ms.location();
		ms.famousFor();
		
		Gulmarg g = new Gulmarg();
		g.location();
		g.famousFor();
		
	}

}

/*
 
Output:
Calling methods using Parent class reference:
Manali is located in Himachal Pradesh.
Manali is famous for snowfall.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for waterfalls.
Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for cable cars.

Calling methods using Subclass objects:
Manali is located in Himachal Pradesh.
Manali is famous for snowfall.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for waterfalls.
Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for cable cars.
  

*/

/*
 Create abstract class vaccine.Create two variables age(int),nationality(String).
 create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the first dose
 if the user is Indian and age is 18.After vaccination the user has to pay 250rs(which will be displayed
 on the console). Scenario 2: Users are eligible to take the second dose only after completing the first dose.
 Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation class
 vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all 
 methods accordingly.
[Hint:Create constructor to initialize variables age and nationality,Use flow control(If else) to check condition]  
*/

package com.tasks;

//Abstract class
abstract class Vaccine{
	int age;
	String nationality;
	
	// Constructor
    Vaccine(int age, String nationality) {
		this.age = age ;
		this.nationality = nationality;
	}
    
    // Abstract method for booster dose
	public abstract void boosterDose(boolean secondDoseDone);
	
	// Method for first dose
	public void firstDose() {
		if(nationality.equalsIgnoreCase("Indian") && age>=18) {
			System.out.println("First dose is successful. Pay Rs.250 .");
		}
		else {
			System.out.println("not eligible for first dose.");
		}
	}
	
	// Method for second dose
	public void secondDose(boolean firstDoseDone) {
		if(firstDoseDone) {
			 System.out.println("Second dose successful.");
        } else {
            System.out.println("Complete the first dose first.");
        }
	}	
	
}

//Implementation class
class VaccinationSuccessful extends Vaccine{
	
	// Constructor
	VaccinationSuccessful(int age , String nationality){
		super(age, nationality);
	}
	
	// Implementation of boosterDose method
	public void boosterDose(boolean secondDoseDone) {
		if(secondDoseDone) {
			System.out.println("Booster dose successful.");
		}
		else {
			System.out.println("Complete the second dose first.");
		}
	}
	
}


public class Vaccination {

	public static void main(String[] args) {
		//For eligible user
		Vaccine person1 = new VaccinationSuccessful(22, "Indian");
		person1.firstDose();
		person1.secondDose(true);
		person1.boosterDose(true);
		
		//For not-eligible user
		System.out.println();
		Vaccine person2 = new VaccinationSuccessful(14, "Indian");
		person2.firstDose();
		person2.secondDose(false);
		person2.boosterDose(false);
	}

}



/*

Output:
First dose is successful. Pay Rs.250 .
Second dose successful.
Booster dose successful.

not eligible for first dose.
Complete the first dose first.
Complete the second dose first.
  
 */
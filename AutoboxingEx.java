/*  Write  a java program for Autoboxing.(All Primitive Types) */

package com.tasks;

public class AutoboxingEx {

	public static void main(String[] args) {
		System.out.println("Autoboxing");
		int i=50;
		Integer i1=Integer.valueOf(i);//explicit conversion
		System.out.println(i1);
		
		byte b = 10;
		Byte b1 = Byte.valueOf(b);// Explicit conversion
		System.out.println(b1);
		
		short s = 20;
		Short s1 = Short.valueOf(s);// Explicit conversion
		System.out.println(s1);
		
		long l = 300L;
		Long l1 = Long.valueOf(l);// Explicit conversion
		System.out.println(l1);
		
		double d = 99.99;
        Double d1 = Double.valueOf(d);// Explicit conversion
        System.out.println(d1);
        
        char c = 'A';
        Character c1 = Character.valueOf(c);// Explicit conversion
        System.out.println(c1);

        boolean bl = true;
        Boolean bl1 = Boolean.valueOf(bl);// Explicit conversion
        System.out.println(bl1);
        
        float f = 5.75f;
        Float f1 = Float.valueOf(f);// Explicit conversion
        System.out.println(f1);


	}

}


/*
 
Output:
Autoboxing
50
10
20
300
99.99
A
true
5.75
  
*/

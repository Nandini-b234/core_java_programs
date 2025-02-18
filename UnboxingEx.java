/* Write a java program for  Unboxing.(all types) */

package com.tasks;

public class UnboxingEx {

	public static void main(String[] args) {
		System.out.println("unboxing");
		Integer i=new Integer(60);// Creating Integer object
		int i1 =i.intValue();//explicit conversion
		System.out.println(i1);
		
		Byte b = new Byte((byte)10);// Creating Byte object
		byte b1 = b.byteValue();//explicit conversion
		System.out.println(b1);

		Short s = new Short((short) 20);// Creating Short object
        short s1 = s.shortValue();//explicit conversion
        System.out.println(s1);

        Long l = new Long(300L);// Creating Long object
        long l1 = l.longValue();//explicit conversion
        System.out.println(l1);

        Float f = new Float(5.75f);// Creating Float object
        float f1 = f.floatValue();//explicit conversion
        System.out.println(f1);

        Double d = new Double(99.99);// Creating Double object
        double d1 = d.doubleValue();//explicit conversion
        System.out.println(d1);

        Character c = new Character('A');// Creating Character object
        char c1= c.charValue();//explicit conversion
        System.out.println(c1);

        Boolean bl = new Boolean(true);// Creating Boolean object
        boolean bl1 = bl.booleanValue();//explicit conversion
        System.out.println(bl1);
	}

}


/*

Output:
unboxing
60
10
20
300
5.75
99.99
A
true
  
  
*/

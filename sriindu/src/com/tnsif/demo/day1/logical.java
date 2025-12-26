package com.tnsif.demo.day1;

public class logical {

	public static void main(String[] args) {
		 // Using int data type
        int a = 10, b = 20;
        System.out.println("Using int:");
        System.out.println((a > 5) && (b > 15));   // true
        System.out.println((a > 15) || (b > 15));  // true
        System.out.println(!(a > b));              // true

        // Using float data type
        float x = 5.5f, y = 3.2f;
        System.out.println("\nUsing float:");
        System.out.println((x > y) && (y < 5.0));  // true
        System.out.println((x < y) || (y > 2.0));  // true
        System.out.println(!(x == y));             // true

        // Using char data type
        char ch1 = 'A', ch2 = 'B';
        System.out.println("\nUsing char:");
        System.out.println((ch1 < ch2) && (ch1 == 'A')); // true
        System.out.println((ch1 == 'C') || (ch2 == 'B'));// true
        System.out.println(!(ch1 > ch2));                // true

        // Using boolean data type
        boolean p = true, q = false;
        System.out.println("\nUsing boolean:");
        System.out.println(p && q);   // false
        System.out.println(p || q);   // true
        System.out.println(!p);       // false

        // Using String data type
        String s1 = "Java";
        String s2 = "Programming";
        System.out.println("\nUsing String:");
        System.out.println((s1.equals("Java")) && (s2.length() > 5)); // true
        System.out.println((s1.equals("Python")) || (s2.contains("gram"))); // true
        System.out.println(!(s1.isEmpty()));// true


	}

}

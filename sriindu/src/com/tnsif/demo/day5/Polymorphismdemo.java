package com.tnsif.demo.day5;

public class Polymorphismdemo {
	int Rno=107;
	String Name="shiva";
	float CGPA=7.9f;
	public void dhoni(int a) {
		System.out.println("R:"+Rno);
	}
	public void dhoni(String a,float b) {
		System.out.println("B:"+ Name );
	}
	public void dhoni(float b,String a) {
		System.out.println("C:"+CGPA);
		
	}

}

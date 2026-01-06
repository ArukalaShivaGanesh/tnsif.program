package com.tnsif.demo.day4;

public class Overload {
	int sid=107;
	String sname="shiva";
	Overload()
	{
		System.out.println("The student name is:"+sname);
		System.out.println("The student id is:"+sid);
	}
	Overload(int a){
		System.out.println("The student id is:"+sid+"The value of a is:"+a);
	 
	}
	Overload(int a,String b){
		System.out.println("The value is:"+a+"The value is:"+b);
	}

}

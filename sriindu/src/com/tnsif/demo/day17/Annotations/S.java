package com.tnsif.demo.day17.Annotations;
public class S {	
	public void show() {
		System.out.println("Parent");		
		}
}
class B extends S{
@Override
public void show() {
	System.out.println("child");
}
}

package com.tnsif.demo.day5;

public class Thiskey {
	int a=20;
	public void show() {
		int a=10;
		System.out.println("Local variable"+a);
		System.out.println("Instance variable"+this.a);
	}

}

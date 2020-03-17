package com.java.test;

public class TestObjectClass {
 String name;  //instant variable or class variable because variable created at class lavel.
	public static void main(String[] args) {
		TestObjectClass obj = new TestObjectClass();
		obj.name="Training";
		System.out.println("Printing name instance variable "+obj.name);
	
		TestObjectClass objTwo = new TestObjectClass();
		objTwo.name="Java";
		System.out.println("Printing second name instance variable "+objTwo.name);
		
		objTwo.testMethod();	
	}
	public void testMethod() {
		System.out.println("Selenium");
	}


}

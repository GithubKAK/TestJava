package com.java.test;

public class Yamaha {

	public static void main(String[] args) {
	Motorcycle m = new Motorcycle();
	m.make = "Yamaha RZ350 ";
	m.color = "Yellow ";
	System.out.println("Calling showAtts ...");
	m.showAtts();
	System.out.println("-------------------------");
	System.out.println("Starting engine ");
	m.startEngine();
	System.out.println("-------------------------");
	System.out.println("Calling showAtts ...");
	m.showAtts();
	System.out.println("---------------------");
	System.out.println("Starting engine ");
	m.startEngine();
	}

}

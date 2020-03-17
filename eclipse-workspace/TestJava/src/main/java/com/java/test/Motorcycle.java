package com.java.test;
// It is at 1:35 
public class Motorcycle {
	
	String make;  //attribute 
	String color;
	boolean engineState = false;
	
	void startEngine() {
		if (engineState == true)
			System.out.println("The engine is already on.");
		else {
			engineState = true;
			System.out.println("The engine is now on");
			
		}
	}
	
			void showAtts() {
				System.out.println("This motorcycle is a "+color +"  "+ make);
				if(engineState == true) 
					System.out.println("The engin is already on");
					else System.out.println("The engine is off");
				
					}
			}
		
	





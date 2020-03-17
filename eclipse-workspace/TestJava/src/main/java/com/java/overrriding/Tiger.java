package com.java.overrriding;

public class Tiger extends Animal{
	
public static void main(String args[]) 
{
	Tiger tiger = new Tiger();
	tiger.eat();
	tiger.hunt();
	tiger.sleep();
	
}

public void eat() {
	System.out.println("Tiger is eating ");
}
public void sleep() {
		System.out.println("Tiger is sleeping ");
	}


}


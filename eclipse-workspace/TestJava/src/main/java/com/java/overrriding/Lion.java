package com.java.overrriding;

public class Lion extends Animal {
	
public static void main(String args[]) {
	Lion lion = new Lion();
	lion.eat();
	lion.hunt();
	lion.sleep();
}
public void hunt() {
	System.out.println("Lion is hunting ");
}

	}



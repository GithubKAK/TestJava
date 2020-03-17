package com.java.test;

public class TestStatic {

	public static void main(String[] args) {
	System.out.println("Adding four numbers "+TestStatic.addFourNumbers(100, 30, 20, 10));

	}
	static int addFourNumbers(int a, int b, int c, int d) {
		int x=a+b+c+d;
		return x;
	}

}

package com.java.overloading;

public class Addition {

	public static void main(String[] args) {
		// Method overloading 
		Addition add=new Addition();
		System.out.println(add.add(5, 5));
		System.out.println(add.add(5, 6, 7));
		System.out.println(add.add(597.987, 698.123));
		System.out.println(add.add(597.987, 698.123, 734.987));

	}
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
}
	public double add(double a, double b)
	{
		return a+b;
}
	public double add(double a, double b, double c)
	{
		return a+b+c;
	}
}
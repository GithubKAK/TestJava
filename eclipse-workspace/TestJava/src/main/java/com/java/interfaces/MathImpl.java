package com.java.interfaces;

public class MathImpl implements mathematicInterfaice, CalculatorInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathImpl impl=new MathImpl();
		System.out.println(impl.addTwoNum(5,  5));
		System.out.println(impl.subTwoNum(5,  5));
		System.out.println(impl.mulTwoNum(5,  5));
		System.out.println(impl.divTwoNum(5,  5));
		System.out.println(impl.addThreeNum(345.876, 123.324, 675.651));
		System.out.println(impl.subThreeNum(345.876, 123.324, 675.651));
		System.out.println(impl.mulThreeNum(345.876, 123.324, 675.651));
		System.out.println(impl.divThreeNum(345.876, 123.324, 675.651));

	}

	public int addTwoNum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int subTwoNum(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public int mulTwoNum(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public int divTwoNum(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
		
		
	}

	public double addThreeNum(double a, double b, double c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	public double subThreeNum(double a, double b, double c) {
		// TODO Auto-generated method stub
		return a-b-c;
	}

	public double mulThreeNum(double a, double b, double c) {
		// TODO Auto-generated method stub
		return a*b*c;
	}

	public double divThreeNum(double a, double b, double c) {
		// TODO Auto-generated method stub
		return a/b/c;
	}

}

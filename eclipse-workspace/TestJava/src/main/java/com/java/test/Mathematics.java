package com.java.test;

public class Mathematics {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Mathematics m = new Mathematics();
		System.out.println("Adding three numbers "+m.addThreeNumbers(22.5, 26.5, 35.9));
		System.out.println("Adding three numbers "+m.subTwoNumbers(1136677, 1135365));
		System.out.println("Adding three numbers "+m.muntiplyThreeNumbers(113, 11, 22));
		System.out.println("Adding three numbers "+m.divideTwoNumbers(25.5, 2.5));

	}
	
	
	
	void testMethod() {
		
	}
	double addThreeNumbers(double a, double b, double c) 
	{
		double n=a+b+c;
		return n;
	
	}
	long subTwoNumbers(long a, long b ) 
	{
		long n=a-b;
		return n;

}
	int muntiplyThreeNumbers(int a, int b, int c) 
	{
		int n=a*b*c;
		return n;
}
	double divideTwoNumbers(double a, double b ) 
	{
		double n=a/b;
		return n;
}
}
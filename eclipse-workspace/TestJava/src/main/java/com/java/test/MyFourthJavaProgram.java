package com.java.test;

public class MyFourthJavaProgram {
	public static void main(String [] args) {
		int i=10;
		
		for(String value:args) {
			System.out.println("Pringting the value :"+value);
		}
		for(i=0;i<=10;i++) {
			System.out.println("Printing "+i);
		}
		int a=10,b=4,res;
		res=a+b;
		a+=b; //a=a+b; same 
		a=a+b;
		
		
		
		System.out.println("a+b is "+res);
		res=a-b;
		System.out.println("a-b is "+res);
		res=a*b;
		System.out.println("a*b is "+res);
		res=a/b;
		System.out.println("a/b is "+res);
		res=a%b;
		System.out.println("a%b is "+res);
		
		// String conat
		String firstName = "Mark";
		String lastName = "White";
		String fullName = firstName+lastName;
	
	System.out.println("Full Name is "+fullName);
	
	if (a >b) {
		System.out.println("a is greater then b");
	}
	else {
		System.out.println("a is less than or equal to b");
	}
		if (a!=b) {
			
			System.out.println("a is not equel to b");
		}
		else
		{
			System.out.println("a is greate than b ");
		}
	}
}

	


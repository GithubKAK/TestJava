package com.java.collectionset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) 
	
	{
		// Collection c;
		// c = new ArrayList();
		
		Collection c=new ArrayList();
		for(int i=20;i<=80; i++) {
			if(i%5==0) 
			{
				System.out.println("Print the even numbers "+i);
				c.add(i);
			}
			
		}
		Iterator iter=c.iterator();
		while(iter.hasNext()) {
			System.out.println("Print the value inside the list "+iter.next());
		}
	
	
	
	
	}

}

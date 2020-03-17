package com.java.collectionset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEvenNumbers {

	public static void main(String[] args) {
		//creating a object of collection ArrayList kind 
		Collection c=new ArrayList();
		
		for (int i=0; i<=15; i++) {
			if(i%2==0) {
				c.add(i);
			}
		}Iterator it=c.iterator();
		while(it.hasNext()) {
			//it.hasNext();
			System.out.println("Print the value inside the List "+it.next());
			
		}

	}

}

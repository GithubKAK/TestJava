package com.java.collectionset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
	 ArrayList<Integer> list=new ArrayList<Integer>();
	 ListIterator listliter=list.listIterator();
	 
	 for(int i=1; i<=1000; i++) {
		 listliter.add(i);
	 }
	 System.out.println("Print the list "+list);
		
	while(listliter.hasPrevious())	{
	System.out.println("Print each element "+listliter.hasPrevious());
}

	}

}

package com.java.collectionset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list=new ArrayList<Integer>();
		
		 LinkedList<Integer>linklist=new LinkedList<Integer>();
		 
		 for(int i=0; i<=10; i++) {
			 linklist.add(i);
			 System.out.println("Print the list "+i);
		 }
			 
		
		 
		 linklist.getFirst();
		 linklist.getLast();
		 System.out.println("Print the fist "+linklist.getFirst());
		 System.out.println("Print the Last "+linklist.getLast());
		 
			 
		 }
	}



package com.java.collectionset;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		int k=0;
		int j=0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				j=i;
			}
				
			else {
				k=i;
				
			}
			map.put(j, k);
				
			System.out.println("Printing  map  "+map);
		}

	}

}
//Arr, coll,
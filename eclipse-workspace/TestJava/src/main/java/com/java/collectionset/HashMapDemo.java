package com.java.collectionset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahanz", new Double(123.564));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		System.out.println("Print hash map"+hm);
		//Get a set of the entries
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+":  ");
			System.out.println(me.getValue());
		}
		
		System.out.println();
		double balance = ((Double)hm.get("Zara")).doubleValue();
		hm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: "+hm.get("Zara"));

	}

}

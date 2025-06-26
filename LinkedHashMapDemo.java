package oops;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		// Insertion order is maintained here

//		LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<Integer, String>(5); 
//		
//		lhm1.put(1, "A");
//		lhm1.put(2, "B");
//		lhm1.put(3, "C");
//		lhm1.put(4, "D");
//		lhm1.put(5, "E");
//		
//		lhm1.forEach((k,v) -> System.out.println(k + " " + v));
//		
//		lhm1.put(10, "J");
//		lhm1.put(9, "I");
//		
//		lhm1.forEach((k,v) -> System.out.println(k + " " + v));
//		
//		lhm1.get(9);
//		
//		lhm1.forEach((k,v) -> System.out.println(k + " " + v)); // Order has not changed because of accessing

		// Access order is maintained here, 0.75f is loading factor
		
//		LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<Integer, String>(5, 0.75f, true); 												
//
//		lhm2.put(1, "A");
//		lhm2.put(2, "B");
//		lhm2.put(3, "C");
//		lhm2.put(4, "D");
//		lhm2.put(5, "E");
//
//		lhm2.forEach((k, v) -> System.out.println(k + " " + v));
//
//		lhm2.put(10, "J");
//		lhm2.put(9, "I");
//
//		lhm2.forEach((k, v) -> System.out.println(k + " " + v));
//
//		String s1 = lhm2.get(9);
//		System.out.println(s1);
//
//		String s2 = lhm2.get(4);
//		System.out.println(s2);
//
//		lhm2.forEach((k, v) -> System.out.println(k + " " + v)); // Order has changed because of accessing
		
//		here we are ensuring fixed size limit for the LinkedHashMap. Least Recently Used elements will be removed when new entries come in
		
		LinkedHashMap<Integer, String> lhm3 = new LinkedHashMap<Integer, String>(5) {
				 protected boolean removeEldestEntry(Map.Entry e)
        {
            return size()>5;
        }
				 
		};

		lhm3.put(1, "A");
		lhm3.put(2, "B");
		lhm3.put(3, "C");
		lhm3.put(4, "D");
		lhm3.put(5, "E");

		lhm3.forEach((k, v) -> System.out.println(k + " " + v));

		lhm3.put(10, "J");
		lhm3.put(9, "I");

		lhm3.forEach((k, v) -> System.out.println(k + " " + v));

		String s1 = lhm3.get(9);
		System.out.println(s1);

		String s2 = lhm3.get(4);
		System.out.println(s2);

		lhm3.forEach((k, v) -> System.out.println(k + " " + v)); // Order has changed because of accessing


	}

}

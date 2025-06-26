package oops;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Map.of(0,"A",1,"B",2,"C"));
		
		tm.put(10, "J");
		System.out.println(tm);
		
		tm.put(8, "H");
		System.out.println(tm); // see that it is stored  in sorted order by key
		
		System.out.println(tm.get(2));
		
		System.out.println(tm.get(5)); // you will get null for non-existent key
		
		System.out.println(tm.get(tm.ceilingKey(5))); // you will get value of next higher key
		
		System.out.println(tm.get(tm.floorKey(5))); // you will get value of next lower key

	}

}

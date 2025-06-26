package oops;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
        HashMap<Integer, String> hm = new HashMap<Integer, String>(Map.of(0,"A",1,"B",2,"C"));
		
		hm.put(10, "J");
		System.out.println(hm);
		
		hm.put(8, "H");
		System.out.println(hm); // see that it is not stored  in sorted order by key
		
		System.out.println(hm.get(2));
		
		System.out.println(hm.get(5)); // you will get null for non-existent key
		
		// not possible in hash map as it does not have ordering - these are possible in TreeMap
//		System.out.println(hm.get(hm.ceilingKey(5))); 
//		System.out.println(hm.get(hm.floorKey(5))); 

	}

}

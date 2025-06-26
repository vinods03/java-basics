package oops;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		 LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
	        
	        lhs.add("A");
	        lhs.add("C");
	        lhs.add("E");
	        lhs.add("K");
	        lhs.add("B");
	        lhs.add("G");
	        lhs.add("B");
	        
	        System.out.println(lhs);

	        lhs.add("M");
	        
	        System.out.println(lhs); // Note that insertion order is maintained
	        
	        lhs.addFirst("X"); // addFirst() & addLast() allowed unlike HashSet & TreeSet. Same for removeFirst, removeLast, getFirst, getLast
	        
	        System.out.println(lhs);
	        
            lhs.addLast("Z");
	        
	        System.out.println(lhs);
		
		
	        
	       
	}

}

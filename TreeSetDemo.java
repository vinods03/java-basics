package oops;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));

		ts.add(25);

		// ts.ceiling(55);

		System.out.println(ts);

		ts.add(4);

		System.out.println(ts); // Note that the order of elements is maintained

		System.out.println(ts.ceiling(3)); // nearest element higher than the given element

		System.out.println(ts.floor(3)); // nearest element lower than the given element
		
//		below are not supported because they defy the ordering implicit in a TreeSet.

//		ts.addFirst(900);
//		System.out.println(ts);		
//		ts.addLast(900);		
//		System.out.println(ts);

	}

}

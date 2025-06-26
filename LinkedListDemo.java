package oops;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>(); // note, you cannot give a size as in arraylist
		LinkedList<Integer> l2 = new LinkedList<>(List.of(10, 20, 30, 40, 50));
		
//		 all of these are available in ArrayList as well
		l1.add(10);
		l1.add(20);
		l1.addAll(l2);
		l1.addFirst(0);
		l1.addLast(1000);
		
		System.out.println(l1);
		
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		
		System.out.println(l1);
		
		l1.add(0,995);
		System.out.println(l1);
		
		System.out.println(l1.contains(780));
		
		l1.remove(3);
		System.out.println(l1);
		
		System.out.println(l1.get(3));
		
//		Below are new in LinkedList
		int a = l1.peek(); // retrieves first element
		System.out.println(a);
		System.out.println(l1);
		
		int b = l1.peekFirst(); // retrieves first element
		System.out.println(b);
		System.out.println(l1);
		
		int c = l1.peekLast(); // retrieves last element
		System.out.println(c);
		System.out.println(l1);
		
		l1.removeFirstOccurrence(10);
		System.out.println(l1);
		
		
//		below are present in array list as well
		l1.clear();
		System.out.println(l1.isEmpty());


	}

}

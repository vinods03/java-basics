package oops;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>(20);
		ArrayList<Integer> a2 = new ArrayList<>(List.of(10,20,30,40,50));
		
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(0,400); // add element at a given index. If you try to add at index 10, you will get IndexOutOfBoundsExceptions
		a1.add(4,500);
		
		System.out.println(a1);
		System.out.println(a2);
		
		a1.add(3,250); // add will shift other elements and this element
		System.out.println(a1);
		
		a1.set(4, 350); // set will simply replace the element in that index
		System.out.println(a1);
		
		int x = a1.get(5);
		System.out.println(x);
		
//		below will result in index out of bounds exception
//		int y = a1.get(6);
//		System.out.println(x);
		
		int y = a1.indexOf(100);
		System.out.println(y);
		
		a1.add(100);
		System.out.println(a1);
		
		int z = a1.lastIndexOf(100);
		System.out.println(z);
		
		a1.remove(3); // 3 is the index
		System.out.println(a1);
		
		System.out.println(a1.get(3));
		
		a1.addFirst(87);
	    a1.addLast(189);
	    System.out.println(a1);
			
		a1.removeFirst();
		System.out.println(a1);
		
		a1.removeLast();
		System.out.println(a1);
		
		
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		
		a1.addAll(a2);
		System.out.println(a1);
		
//		One way to parse through the array list
		System.out.println("Without iterator");
		for(Integer m:a1) {
			System.out.print(m + " ");
		}
		
		System.out.println("");
		
//		another way to parse through the array list
		System.out.println("For loop and iterator");
		for(Iterator<Integer> it = a1.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println("");
		
//		another way to parse through the array list
		System.out.println("wwhile loop and iterator");
		Iterator<Integer> it1 = a1.iterator();
		while (it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		
		System.out.println("");  
		
		System.out.println(a1.contains(780));		
		
		a1.clear();
		System.out.println(a1.isEmpty());
		

	}

}

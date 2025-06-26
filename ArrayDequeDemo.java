package oops;

import java.util.ArrayDeque;



public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		
		// Note that you cannot perform add(index, element) here. Same for get / remove.
		
		dq.add(1);
		dq.addFirst(0);
		dq.addLast(2);
		
		System.out.println(dq);
		
		dq.offer(3);
		dq.offerFirst(4);
		dq.offerLast(5);
		
		System.out.println(dq);
		
		dq.removeFirst();
		dq.removeLast();
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		

	}

}

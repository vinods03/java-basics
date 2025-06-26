package oops;

import java.util.*;

class MyCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
//		Note that, you cannot perform addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast() etc here.
		
		p.add(20);
		p.add(10);
		p.add(30);
		
		p.offer(5);
		p.offer(95);
		
		System.out.println(p);
		
//		
//		
		
		PriorityQueue<Integer> q = new PriorityQueue<>(new MyCom());
		
//		Note that, you cannot perform addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast(). peekFirst(), peekLast() etc here.
		
		q.add(20);
		q.add(10);
		q.add(30);
		
		q.offer(5);
		q.offer(95);
		
		System.out.println(q);
		
//		peek will get first element, poll will remove it.
		System.out.println(q.peek());
		
		q.poll();
		System.out.println(q);

	}

}

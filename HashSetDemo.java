package oops;

import java.util.*; 

public class HashSetDemo {

	public static void main(String[] args) {
		
    HashSet<Integer> hs=new HashSet<>(20,0.75f); // 20 is initial size, 0.75f is the loading factor
//    advisable to not have 100% loading factor for hashset to enable easier querying
//    in cases, where hash logic slots 2 elements at the same place, the 2nd element is kept at the next slot.
//    when querying, if not found in calculated slot, next slot is queried and so on till empty space. 
//    So empty space is important in hash set.
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10); // duplicate will not be stored
        
        System.out.println(hs);
        
        System.out.println(hs.size());
        
//		addFirst() & addLast() are not supported because they defy the hash logic implementation implicit in a HashSet.

	}

}

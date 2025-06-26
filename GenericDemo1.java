// an array of generic type/class that can hold all strings or all integers (not a mix of both in same array though).

package oops;

 class GenericDemo1<T> {
	
//	This is how you create an generic Object array
//	This array can hold strings or integers etc but cannot be a mix of both
//	Note how the class is also having a <T> indication
	T data[] = (T[]) new Object[3];
	
 

	public static void main(String[] args) {
		
		GenericDemo1<String> gd1 = new GenericDemo1();
		gd1.data[0] = "Hi";
		gd1.data[1] = "Bye";
//		below not allowed
//		gd1.data[2] = 1;
		gd1.data[2] = "OK";
		
			
		
		GenericDemo1<Integer> gd2 = new GenericDemo1();
		gd2.data[0] = 1;
		gd2.data[1] = 2;
//		below not allowed
//		gd2.data[2] = "box";
		gd2.data[2] = 3;
		
		
		
	}
	
}



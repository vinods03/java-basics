// so far, we have seen generic classes i.e. classes having generic member variables
// here we will see generic methods i.e. classes having generic methods that accept generic parameters

package oops;

class MyArray9 {
	
	<T> void show(T[] lst) {
		
		for (T x: lst) {
			System.out.println(x);
		}
		
	}
}

public class GenericDemo5 {

	public static void main(String[] args) {
		
		MyArray9 ma = new MyArray9();
		
		ma.show(new String[]{"Hi", "Bye", "OK"});
		ma.show(new Integer[]{1,2,3});

	}

}

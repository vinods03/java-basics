// inheriting generic classes behavior

package oops;

class MyArray1<T> {
	
	T data[] = (T[]) new Object[3];
	
	int i = 0;
	public void setT(T val) {
		data[i] = val;
		i++;
	}
	
	public void getT() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}

// extending the MyArray1 class only for String type
class MyArray2 extends MyArray1<String> {
	
}

//extending the MyArray1 class not for a specific type, so you need to specify this class also a generic class or generic type class
class MyArray3<T> extends MyArray1<T> {
	
}


public class GenericDemo3 {

	public static void main(String[] args) {
		
		MyArray2 ma2 = new MyArray2();
		ma2.setT("Ao");
		
//		below not allowed because u r extending only for String
//		ma2.setT(1);
		
		MyArray3 ma3 = new MyArray3();
		ma3.setT("Ao");
		
//		below is allowed now
		ma3.setT(1);

	}

}

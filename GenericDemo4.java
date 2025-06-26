// generic class that is bound to a specific wrapper class like Number, String etc.

package oops;

class MyArray8<T extends Number> {
	
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

public class GenericDemo4 {

	public static void main(String[] args) {
		
		MyArray8 ma = new MyArray8();
		
		ma.setT(1);
		ma.setT(1.86f);
		ma.setT(245.1);
		
//		below not allowed because the generic class extends Number and hence only allows double, float, int, byte etc;
//		ma.setT("AB");

	}

}

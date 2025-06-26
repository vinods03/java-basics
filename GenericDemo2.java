// Similar to GenericDemo1 except using getters / setters to assign array values
// also shown how a generic class can hold a mix of both strings & integers

package oops;

class MyArray<T> {
	
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

public class GenericDemo2 {

	public static void main(String[] args) {
		
		MyArray<Integer> ma = new MyArray<>();
		ma.setT(10);
		ma.setT(20);
		ma.setT(30);
		ma.getT();
		
		MyArray<String> ma1 = new MyArray<>();
		ma1.setT("Hi");
		ma1.setT("Bye");
		ma1.setT("OK");
		ma1.getT();
		
//		Note below array accepts both strings & integers
		MyArray ma2 = new MyArray<>();
		ma2.setT("Hi");
		ma2.setT(1);
		ma2.setT("OK");
		ma2.getT();


	}

}

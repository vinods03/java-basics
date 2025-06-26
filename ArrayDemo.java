// Reversing an array

package oops;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int B[] = new int[10];
		
		for (int i = A.length-1, j=0; i >= 0; i--, j++) {
			B[j] = A[i];
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(B[i]);
		}
		

//		Below are not possible - note thse in context of ArrayList etc
		
//		System.out.println(A); possible, but will print address
//		A[11] = 11; IndexOurOfBounds error, you cannot expand/shrink as in ArrayList
//		A[4] = 40; possible but will overwrite value
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}

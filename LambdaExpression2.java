// here we are seeing how to pass parameters and get return values from lambda expressions i.e. functional interfaces.
// here you can create an object of the interface (usually not allowed) along with the implementation of the method defined in the interface

package oops;

@FunctionalInterface
interface AddLambda {
	
	public int addn(int a, int b);
	
}

public class LambdaExpression2 {

	public static void main(String[] args) {
		
		AddLambda l = (x,y)-> x+y;
		int r = l.addn(7, 8);
		System.out.println(r);

	}

}

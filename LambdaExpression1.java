// @FunctionalInterface is an interface that haas only 1 abstract method
// Note here, we have not implemented a class that implements the interface. 
// we have directly implemented the code for the interface in the main method.

package oops;

@FunctionalInterface
interface MyLambda {
	
	public void display();
	
}

public class LambdaExpression1 {

	public static void main(String[] args) {
		
		MyLambda m = ()->{
			System.out.println("Hey");
		};
		
		m.display();
		
		MyLambda m1 = ()->{
			System.out.println("Buy");
		};
		
		m1.display();

	}

}

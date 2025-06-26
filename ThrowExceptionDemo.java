package oops;

class NegativeDimensionException extends Exception {
	
	public String toString() {
		return "Shape cannot have negative dimensions";
	}
}

class AreaFinder {
	
	private int a = 1;
	private int b = 1;
	
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
//	constructor for using default values of the member variables
	public AreaFinder() {
		
	}
	
//	constructor for overriding the default values of member variables
	public AreaFinder(int a, int b) {
		this.setA(a);
		this.setB(b);
	}
	
	public int area() throws NegativeDimensionException {
		
		if (this.a < 0 || this.b < 0) {
			throw new NegativeDimensionException();
		} else {
			return this.a * this.b;
		}
	}
}

public class ThrowExceptionDemo {
	
	public static void main(String[] args) {
		
		AreaFinder af1 = new AreaFinder(5,10);
		try {
			System.out.println(af1.area());
		} catch (NegativeDimensionException e) {
			System.out.println(e);
		} finally {
			System.out.println("I am done with calculating the area");
		}
		
		AreaFinder af2 = new AreaFinder(-5,10);
		try {
			System.out.println(af2.area());
		} catch (NegativeDimensionException e) {
			System.out.println(e);
		} finally {
			System.out.println("I am done with calculating the area");
		}
		
	}
}

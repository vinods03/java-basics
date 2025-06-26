package oops;

abstract class Shape {

	abstract public double perimeter();

	abstract public double area();

//	this is just to demo that an abstract class can have concrete variables / methods as well

	private String s = "Shape";

	public void display() {
		System.out.println("This is from the " + s + " class");
	}
}

// first class extending the abstract class
class Circle extends Shape {

//	default value
	private double radius = 1;

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

//	default constructor will use default value 1 for radius
	public Circle() {

	}

//	use this constructor when u want to use a different radius
	public Circle(double x) {
		this.setRadius(x);
	}

	public double perimeter() {
		return 2 * Math.PI * (this.getRadius());
	}

//	all methods in an abstract class must be implemented in any class that extends the abstract class
//	for ex, if below method is not implemented, class will be invalid
	public double area() {
		return Math.PI * (this.getRadius()) * (this.getRadius());
	}

	private String s = "Circle";

	public void display() {
		System.out.println("This is from the " + s + " class");
	}

}

// second class extending the abstract class
class Rectangle extends Shape {

	private double length = 1;
	private double breadth = 1;

	public double getLength() {
		return this.length;
	}

	public double getBreadth() {
		return this.breadth;
	}

	public void setLength(double l) {
		this.length = l;
	}

	public void setBreadth(double b) {
		this.breadth = b;
	}

	public Rectangle() {

	}

	public Rectangle(double l, double b) {
		this.setLength(l);
		this.setBreadth(b);
	}

	public double perimeter() {
		return 2 * (this.breadth + this.length);
	}

	public double area() {
		return (this.length * this.breadth);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		Circle c = new Circle();

		double prm = c.perimeter();
		double area = c.area();

		c.display();
		System.out.println("The perimeter is: " + prm);
		System.out.println("The area is: " + area);

		Circle c2 = new Circle(2);

		double prm2 = c2.perimeter();
		double area2 = c2.area();

		c2.display();
		System.out.println("The perimeter is: " + prm2);
		System.out.println("The area is: " + area2);

		Rectangle r = new Rectangle(2, 4);

		double prm3 = r.perimeter();
		double area3 = r.area();

//		display() method of parent class is used as child class does not have this
		r.display();
		System.out.println("The perimeter is: " + prm3);
		System.out.println("The area is: " + area3);

	}

}

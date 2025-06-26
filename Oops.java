// getters, setters, multiple constructors, regex


package oops;


class Product {
	
	
//	member variables
	
	private String itemNo;
	private String itemName;
	private double itemPrice;
	
// getters
	
	public String getItemNo() {
		return this.itemNo;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
	
//	setters
	
	public void setItemNo(String itemNo) {
		
//		only alphabets and digits allowed, any number of alphabets / digits is fine
		
		if (itemNo.matches("[\\w]*")) {
			this.itemNo = itemNo;
		} else {
			this.itemNo = "";
		}
		
	}
	
	public void setItemName(String itemName) {
		
//		only alphabets and spaces allowed, one or more number of alphabets is fine
		
		if (itemName.matches("[a-zA-Z\s]+")) {
			this.itemName = itemName;
		} else {
			this.itemName = "";
		}
		
	}
	
	public void setItemPrice(double itemPrice) {
		if (itemPrice <= 0) {
			this.itemPrice = 0;
		} else {
			this.itemPrice = itemPrice;
		}
	}
	
//	constructor 1 - polymorphism / overloading
	
	public Product(String itemNo) {
		setItemNo(itemNo);
	}
	
//	constructor 2 - polymorphism / overloading
	
	public Product(String itemNo, String itemName) {
		setItemNo(itemNo);
		setItemName(itemName);
	}
	
//	constructor 3 - polymorphism / overloading
	
	public Product(String itemNo, String itemName, double itemPrice) {
		this.setItemNo(itemNo);
		this.setItemName(itemName);
		this.setItemPrice(itemPrice);
	}
	
//	String representation of product
	
	public String toString() {
		
		String str_repr = "Item No: " + itemNo + " Item Name: " + itemName + " Item Price: " + itemPrice;
		return str_repr;
	}
}


public class Oops {

	public static void main(String[] args) {
		
//		product using constructor 1
		
		Product product = new Product("a123");
		
		String itemNo = product.getItemNo();
		String itemName = product.getItemName();
		double itemPrice = product.getItemPrice();
		
		System.out.println("Item No is: " + itemNo);
		System.out.println("Item Name is: " + itemName);
		System.out.println("Item Price is: " + itemPrice);
		
		System.out.println("The product is: " + product);
		
		product.setItemName("Cricket Bat");
		product.setItemPrice(45);
		
		System.out.println("The product is: " + product);
		
//		product using constructor 2
		
//		check with special character
		Product product2 = new Product("b~123", "Baseball");
		System.out.println("The product is: " + product2);
		
		
//		product using constructor3
		
//		check with digits in item name and negative value in price
		Product product3 = new Product("c123", "Football12", -45.0);
		System.out.println("The product is: " + product3);
		
//		correct product using constructor4
		Product product4 = new Product("d123", "Football", 45.0);
		System.out.println("The product is: " + product4);
		
		

	}

}

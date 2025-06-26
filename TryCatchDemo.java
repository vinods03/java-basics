package oops;

import java.util.*;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int a = sc.nextInt();
		
		System.out.println("Enter an integer");
		int b = sc.nextInt();
		
		int c;
		
		try {
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

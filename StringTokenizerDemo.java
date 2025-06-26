package oops;

import java.util.*;
import java.io.*;

public class StringTokenizerDemo {

	public static void main(String[] args) {
	
		String data = "name=Vijay;dept=cse;address=delhi;country=india";
		StringTokenizer stk = new StringTokenizer(data,"=;");
		
		while (stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}
		
		
		String data1 = "name=Vijay\ndept=cse\naddress=delhi\ncountry=india";
		StringTokenizer stk1 = new StringTokenizer(data1,"="); // note that you dont need to specify newline character \n as delimiter, it is taken by default
		
		while (stk1.hasMoreElements()) {
			System.out.println(stk1.nextToken());
		}
		
		
		String data2 = "name=Vijay dept=cse address=delhi country=india";
		StringTokenizer stk2 = new StringTokenizer(data2,"= "); 
		
		while (stk2.hasMoreTokens()) { // Tokens or Elements - fine
			System.out.println(stk2.nextToken());
		}


	}

}

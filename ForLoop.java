// has for loop, while loop and switch case statements

package oops;

import java.util.*;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		
		int r;
		String s = "";
		
		while (x>0) {
			r = x%10;
			x = x/10;
			s = s + r;
		}
		
		System.out.println("the number in string format is: " + s);
		char ch;
		
		for (int i = s.length()-1; i >= 0; i--) {
			ch = s.charAt(i);
			
			switch(ch) {
			
				case '0':System.out.print("Zero ");
	            		break;
			    case '1':System.out.print("One ");
			            break;
			    case '2':System.out.print("Two ");
			            break;
			    case '3':System.out.print("Three ");
			            break;
			    case '4':System.out.print("Four ");
			            break;
			    case '5':System.out.print("Five ");
			            break;
			    case '6':System.out.print("Six ");
			            break;
			    case '7':System.out.print("Seven ");
			            break;
			    case '8':System.out.print("Eight ");
			            break;
			    case '9':System.out.print("Nine ");
			            break;
		           
			}
			
			
		}
		
		

	}

}

package oops;

import java.util.*;
import java.io.*;

public class StringTokenizerDemo1 {

	public static void main(String[] args) throws Exception {
		
//		This is a mix of the Properties Demo & String TokenzerDemo, with some changes
//		We read a file using FileInputStream like we did in PropertiesDemo but we dont use the getProperty method of Properties class
//		we read the file contents byte by byte and convert byte array to string
//		Then, like we did in StringTokenizerDemo, we split the data based on delimiter to get multiple tokens i.e. words.
		
		FileInputStream fis = new FileInputStream("MyData.txt");
		
		byte b[]=new byte[fis.available()];
	    fis.read(b);
	    String data=new String(b);
	    
	    System.out.println(data);
	    
	    StringTokenizer stk = new StringTokenizer(data,"="); 
	    ArrayList<String> al = new ArrayList<>();
	    
	    
	    while (stk.hasMoreTokens()) {
	    	al.add(stk.nextToken());
	    }
	    
	    System.out.println(al.get(0));
	    System.out.println(al.get(1));
	     
	     

	}

}

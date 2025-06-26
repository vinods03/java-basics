package oops;

import java.io.*;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) throws Exception {
		
//		read byte by byte
		
		byte[] b = {'a','b','c','d','e','f','g','h','i','j'};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
		int x;
		
		while ((x = bis.read()) != -1) {
			System.out.print(x + " ");
		}
		
		bis.close();
		
		System.out.println("");
		
//		read all bytes
		
		ByteArrayInputStream bis1 = new ByteArrayInputStream(b);
		
		String str = new String(bis1.readAllBytes());
		
		System.out.println(str);
		
		bis1.close();

	}

}

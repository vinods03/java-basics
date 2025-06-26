package oops;

import java.io.*;

public class BufferedInputReaderDemo {

	public static void main(String[] args) throws Exception {
		
//		Same code as BufferedInputStreamDemo.java except that we are using FileReader & BufferedReader to better process text files
//		FileInputStream & BufferedInputStream are better for processing binary files
		
		FileReader fis = new FileReader("C:/MyJava/Source1.txt");
		BufferedReader bis = new BufferedReader(fis);
				
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		System.out.println("");
		System.out.println(bis.readLine());

		bis.close();
		fis.close();
	}

}

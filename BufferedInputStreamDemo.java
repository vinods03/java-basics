package oops;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/MyJava/Source1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
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
		
		bis.close();
		fis.close();

	}

}

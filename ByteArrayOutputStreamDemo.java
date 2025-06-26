package oops;

import java.io.*;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		
		bos.write('a');
		bos.write('b');
		bos.write('c');
		
		byte[] b = bos.toByteArray();
		for (byte x: b) {
			System.out.println(x);
		}
		
		bos.writeTo(new FileOutputStream("C:/MyJava/FromByteArrayOutputStream.txt"));

	}

}

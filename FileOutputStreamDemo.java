package oops;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/MyJava/Test.txt");

		String str = "Learn Java Programming";
		byte b[] = str.getBytes(); // the ascii values of the characters are stored in the byte array

//		writing byte by byte, note that ascii values of the characters in the String are printed
		for (byte x : b) {
			System.out.print(x + " ");
		}

//		writing byte by byte, note that ascii values are converted to characters when writing
		for (byte x : b) {
			fos.write(x);
		}

//		writing full string
		fos.write(str.getBytes());
		
//		extracting a substring to write, from position 6 of the byte[] till the end
		fos.write(b, 6, str.length()-6);

		fos.close();

	}

}

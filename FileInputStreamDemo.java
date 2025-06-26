package oops;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
//		reading byte by byte, note that ascii values of the characters are printed
		
		try {
		
		FileInputStream fis = new FileInputStream("C:/MyJava/Test.txt");
		
		int x;
		while ((x = fis.read()) != -1) { // -1 indicates end of file
			System.out.print(x + " ");
		}
		
		fis.close();
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("");
				
//		reading byte by byte, note that ascii values are converted to characters
		
		try {
			
			FileInputStream fis1 = new FileInputStream("C:/MyJava/Test.txt");
			
			int y;
			while ((y = fis1.read()) != -1) { // -1 indicates end of file
				System.out.print((char)y + " ");
			}
			
			fis1.close();


		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("");
		
//		reading full string
		
        try {
			
			FileInputStream fis2 = new FileInputStream("C:/MyJava/Test.txt");
            
			byte[] b = new byte[fis2.available()];
            fis2.read(b);
			
			String str = new String(b);
            System.out.println(str);
			
			fis2.close();

	} catch (Exception e) {
		System.out.println(e);
	}

	}
	
}

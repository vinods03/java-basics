package oops;

import java.io.*;

public class FileCopyDemo {

	public static void main(String[] args) throws Exception {
		
//		read from one file and write to another - convert uppercase to lowercase during the write
		
		FileInputStream fis = new FileInputStream("C:/MyJava/Source1.txt");
		FileOutputStream fos = new FileOutputStream("C:/MyJava/Destination.txt");
		
		int b;
		while ((b=fis.read()) != -1) {
			if (b >= 65 && b <= 120) {
				fos.write(b+32);
			} else {
				fos.write(b);
			}
		}
		
//		merge contents of 2 files into 1 file
		
		FileInputStream fis1 = new FileInputStream("C:/MyJava/Source1.txt");
		FileInputStream fis2 = new FileInputStream("C:/MyJava/Destination.txt");
		FileOutputStream fos1 = new FileOutputStream("C:/MyJava/FinalDestination.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		
		int c;
		while ((c=sis.read()) != -1) {
			fos1.write(c);
		}
		
		sis.close();
		fis.close();
        fis1.close();
        fis2.close();
        fos.close();
        fos1.close();
		

	}

}

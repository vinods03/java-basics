// very similar to FileInputStream

package oops;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("C:/MyJava/Test.txt");
			
			int x;
			while ((x = fr.read()) != -1) { // -1 indicates end of file
				System.out.print(x + " ");
			}
			
			fr.close();
			
			} catch (Exception e) {
				System.out.println(e);
			} 
	}

}

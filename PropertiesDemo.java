package oops;

import java.util.*;
import java.io.*;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
//		Keys and Values must be strings
		
        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
//        Writing to files
        
//        files created at C:\Users\VINOD\eclipse-workspace\MyJava
        
        p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop");
        
        p.store(new FileOutputStream("MyData.txt"), "Laptop");
        
//        Reading from text file
        
        Properties p1=new Properties();
        
        p1.load(new FileInputStream("MyData.txt"));
        
        System.out.println(p1);
        System.out.println(p1.getProperty("Brand"));
        System.out.println(p1.getProperty("Processor"));
        System.out.println(p1.getProperty("OS"));
        System.out.println(p1.getProperty("Model"));
        
//        Reading from XML file
        
        Properties p2=new Properties();
        
        p2.loadFromXML(new FileInputStream("MyData.xml"));
        
        System.out.println(p2);
        
        System.out.println(p2.getProperty("Brand"));
        System.out.println(p2.getProperty("Processor"));
        System.out.println(p2.getProperty("OS"));
        System.out.println(p2.getProperty("Model"));

	}

}

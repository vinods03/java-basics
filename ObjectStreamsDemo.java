package oops;

import java.io.*;


	class Student implements Serializable {
		
		private int rollno;
		private String name;
		private float avg;
		private String dept;
		
		public static int Data = 10;
		public transient int t;
		
		public Student() {
			
		}
		
		public Student(int r, String n, float a, String d) {
			this.rollno = r;
			this.name = n;
			this.avg = a;
			this.dept = d;
		}
		
		public String toString() {
			  return "\nStudent Details\n"+
		                "\nRoll "+rollno+
		                "\nName "+name+
		                "\nAverage "+avg+
		                "\nDept "+dept+
		                "\nData "+Data+
		                "\nTransient "+t+"\n";
		}
		
	}
	
    public class ObjectStreamsDemo {

		public static void main(String[] args) throws Exception {
			
			FileOutputStream fos = new FileOutputStream("C:/MyJava/Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Student s = new Student(1001, "Vinod", 97.5f, "EEE" );
			oos.writeObject(s);
			
			oos.close();
			fos.close();
			
			
			FileInputStream fis = new FileInputStream("C:/MyJava/Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student s1 = (Student)ois.readObject();
			System.out.println(s1);
			
			ois.close();
			fis.close();
	
		}
		

}

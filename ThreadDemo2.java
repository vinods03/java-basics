// here, there is a single class that extends Thread class, overrides run() method and also has the main method.

package oops;

public class ThreadDemo2 extends Thread {
	
	public void run() {
		
		int i = 1;
		while (i <= 100) {
			System.out.println(i + " Hello ");
			i++;
		}
	}

	public static void main(String[] args) {
		
		ThreadDemo2 t = new ThreadDemo2();
		t.start();
		
		int j = 1;
		while (j <= 100) {
			System.out.println(j + " World !!");
			j++;
		}

	}

}

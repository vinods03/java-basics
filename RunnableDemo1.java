// here, there are 2 classes - 1 implementing the Runnable interface, defines run() method and another class for the main method

package oops;

class MyRunnable implements Runnable {
	
	public void run() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i + " Hello ");
			i++;
		}
	}
}

public class RunnableDemo1 {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		t.start();
		
		int j = 1;
		while (j <= 100) {
			System.out.println(j + " World !!");
			j++;
		}
		

	}

}

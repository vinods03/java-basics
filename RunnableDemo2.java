// here, there is a single class - 1 implementing the Runnable interface, defines run() method and also has the main method

package oops;

public class RunnableDemo2 implements Runnable {
	
	public void run() {
		
		int i = 1;
		while (i <= 100) {
			System.out.println(i + " Hello ");
			i++;
		}
	}

	public static void main(String[] args) {
		
		RunnableDemo2 r = new RunnableDemo2();
		
		Thread t = new Thread(r);
		t.start();
		
		int j = 1;
		while (j <= 100) {
			System.out.println(j + " World !!");
			j++;
		}

	}

}

// here, there are 2 classes - 1 extending the Thread class, overrides run() method and another class for the main method

package oops;

class MyThread extends Thread {

	public void run() {

		int i = 1;
		while (i <= 100) {
			System.out.println(i + " Hello ");
			i++;
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();

		int j = 1;
		while (j <= 100) {
			System.out.println(j + " World !!");
			j++;
		}

	}

}

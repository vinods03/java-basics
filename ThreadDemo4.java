// synchronization ensures 2 threads do not intersect each other - each thread runs and finishes separately
// for this to happen, 2 threads of same object must be created, which means string to be printed must be passed as a param to the method
// i.e. this string cannot be a member variable, because then they will be 2 different objects and sync cannot be achieved

package oops;

class Display {

	synchronized public void show(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
}

class MyThread1 extends Thread {

	Display d1;

	public MyThread1(Display x) {
		this.d1 = x;
	}

	public void run() {
		d1.show("Hello thereeeeeeeeeeeeee ! Hello World !!!!!!!!!!!!!!!!!!");
	}
}

class MyThread2 extends Thread {

	Display d2;

	public MyThread2(Display y) {
		this.d2 = y;
	}

	public void run() {
		d2.show("Welcome to Indiaaaaaaaaaaaaaa");
	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {

		Display z = new Display();
		
		
		MyThread1 t1=new MyThread1(z);
        MyThread2 t2=new MyThread2(z);
        
        t1.start();
        t2.start();

	}

}

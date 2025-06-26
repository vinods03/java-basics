// to achive synchronization as well as ordering between 2 threads, we need to make use of a flag / wait() / notify() etc on top of synchronized methods.

package oops;

class MyData {
	
	int val;
	boolean flag=true;
	
//	getting when flag is false only
	synchronized public int getVal() {
		int m;
		while (flag != false) {
			try {
			wait();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		m=val;
		flag=true;
		notify();
		
		return m;
	}
	
//	setting when flag is true only
	synchronized public void setVal(int v) {
		
		while (flag != true) {
			try {
			wait();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		val = v;
		flag = false;
		notify();
	}
	
}

class Producer extends Thread {
	
	MyData d;
	
	public Producer(MyData d) {
		this.d = d;
	}
	
	public void run() {
		int i = 1;
		while (i <= 100) {
			d.setVal(i);
			System.out.println("Producer: " + i);
			i++;
		}
	}
}


class Consumer extends Thread {
	
	MyData d;
	
	public Consumer(MyData d) {
		this.d = d;
	}
	
	public void run() {
		int i = 1;
		while (i <= 100) {
			i = d.getVal();
			System.out.println("Consumer: " + i);
			i++;
		}
	}
}

public class ThreadDemo5 {

	public static void main(String[] args) {
		
		MyData d = new MyData();
		
		Producer p = new Producer(d);
		Consumer c = new Consumer(d);
		p.start();
		c.start();

	}

}

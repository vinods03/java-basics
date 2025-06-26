// setDaemon(), join(), yield() methods of a Thread

package oops;

class InfiniteLoop extends Thread {
	
	int i = 1;
	public void run() {
		
		while (true) {
			
			System.out.println(i + " Hey there !!");
			i++;
		}
		
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		
		InfiniteLoop t = new InfiniteLoop();
		t.setDaemon(true); // if you set the InfiniteLoop thread as daemon, nothing will be printed because main thread completes killing the damenon thread also.
		t.start();
		
//		to overcome the issue in daemon thread, you need to join all threads in a program like below block
//		then, in below case main thread will wait till all damenon threads like InfiniteLoop thread complete
		
		Thread mainThread = Thread.currentThread();
		try {
			mainThread.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		you also have t.yield() method to give preference to other thread.

	}

}

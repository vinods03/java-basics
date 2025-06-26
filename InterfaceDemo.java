package oops;

interface ICamera {
	void click();
	void videorecord();
	
//	no concrete methods allowed in interface
//	void display() {
//		System.out.println("This is from the ICamera interface");
//	}
}

interface IMusicplayer {
	void play();
	void stop();
	
//	no concrete methods allowed in interface
//	void display() {
//		System.out.println("This is from the IMusicplayer interface");
//	}
}

abstract class Phone {
	abstract void call();
	
//	concrete methods allowed in abstract class
	void display() {
		System.out.println("This is from the Phone abstract class");
	}
	
}

// all methods in abstract class and interfaces must be implemented. else invalid.
class IPhone extends Phone implements ICamera, IMusicplayer {
	
	void call() {
		System.out.println("Calling from IPhone");
	}
	
	public void click() {
		System.out.println("Clicking photo using ICamera");
	}
	
	public void videorecord() {
		System.out.println("Video recording using ICamera");
	}
	
	public void play() {
		System.out.println("Playing music using IMusicplayer");
	}
	
	public void stop() {
		System.out.println("Stopping music on IMusicplayer");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		iphone.call();
		iphone.click();
		iphone.videorecord();
		iphone.play();
		iphone.stop();
		iphone.display();

	}

}

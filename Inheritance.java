package oops;

class Account {

	private String accNumber;
	private String name;
	private String address;
	private String phno;
	private String dob;
	private double balance;

	public String getAccNumber() {
		return this.accNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public String getPhno() {
		return this.phno;
	}

	public String getDob() {
		return this.dob;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhNo(String phno) {
		this.phno = phno;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setBalance(double bal) {
		this.balance = bal;
	}

	public Account(String accNumber, String name, String address, String phno, String dob, double bal) {

		this.setAccNumber(accNumber);
		this.setName(name);
		this.setAddress(address);
		this.setPhNo(phno);
		this.setDob(dob);
		this.setBalance(bal);

	}

//	just to demo polymorphism - overriding

	public void display() {
		System.out.println("This is from Account class");
	}

	public String toString() {
		return "The balance of account number " + this.accNumber + " is: " + this.balance;
	}
}

class SavingsAccount extends Account {

//	the child class can have its own member variables / setters / getters and other methods as well

	private String privilegedAccount;

	public String getPrivilegedAccount() {
		return this.privilegedAccount;
	}

	public void setPrivilegedAccount(String sts) {
		this.privilegedAccount = sts;
	}

//	see how the constructor of the child class is accepting parameters needed for the main class
//	see how the parent constructor is called using super

	SavingsAccount(String accNumber, String name, String address, String phno, String dob, double balance, String privilegedAccount) {

		super(accNumber, name, address, phno, dob, balance);
		this.setPrivilegedAccount(privilegedAccount);

	}

//	Note that below is not valid. compiler will fail with error:
//	Implicit super constructor Account() is undefined. Must explicitly invoke another constructor

//	SavingsAccount(String privilegedAccount) {
//		this.setPrivilegedAccount(privilegedAccount);
//	}
	
//	just to demo polymorphism - overriding

	public void display() {
		System.out.println("This is from Savings Account class");
	}


	public double withdraw(double amt) {

//		see how getBalance() & setBalance() methods of parent class are accessible here

		double currentBalance = this.getBalance();
		currentBalance = currentBalance - amt;

		this.setBalance(currentBalance);
		return currentBalance;
	}

	public double deposit(double amt) {

		double currentBalance = this.getBalance();
		currentBalance = currentBalance + amt;

		this.setBalance(currentBalance);
		return currentBalance;
	}

	public String toString() {
		return "The balance of account number " + this.getAccNumber() + " is: " + this.getBalance();
	}
}

public class Inheritance {

	public static void main(String[] args) {

		SavingsAccount sc = new SavingsAccount("123", "aaa", "bbb", "456-789", "2000/03/24", 100.0, "Yes");

		System.out.println(sc);

		sc.deposit(450);
		System.out.println(sc);

		sc.withdraw(50);
		System.out.println(sc);
		
//		to demo polymorphsim - overriding
//		if the child class display() method is not there, this will show "This is from Account class"
//		if the child class display() method is there, this will show "This is from Savings Account class"
		
		sc.display();

	}

}

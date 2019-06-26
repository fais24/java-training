package oop;

public class BankAccount implements Irate{
	// Define Variables
	String accountNumber;
	//static >> belongs to the class not the object instance
	//final >> constant often static final
	private static final String routingNumber = "111";
	
	//instance variable 
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	//Constructor definition: unique methods
	//1. they are used to define / setup / initialize properties of an object
	//2. constructors are implicitly called upon instantiation
	//3. the same name as the class itself
	//4. constructors have no return type
	BankAccount(){
	System.out.println("NEW ACCOUNT CREATED");
	}
	
	//overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNTi: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Mininum deposit must be at least $1,000";			
		}else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Getters / Setters
	
	//Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name  ;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	
	//Inteface methods
	public void setRate() {
		System.out.println("SETTIN G RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	//define methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	//private : can only be called from within the class 
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	void checkBalance(){
		System.out.println("balance is : " + balance);
	}
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[ NAME:" + name + ". ACCOUNT# " + accountNumber +  ". ROUTING # " + routingNumber + ". BALANCE: $" + balance + " ]";
	}
	
}

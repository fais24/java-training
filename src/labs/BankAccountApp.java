package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("4465329874", 1000.5);
		BankAccount acc2 = new BankAccount("6548548752", 2000);
		BankAccount acc3 = new BankAccount("5468975322", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IIntrest {
	//properties of bank account
	 private static int id = 1000; // Internal ID
	 private String accountNumber; // id + random 2-digit number + first 2 of SSN
	 private static final String routingNumber = "0054400556578";
	 private String name;
	 private String SSN;
	 private double balance; 
	 //encapsulation cant be accessed except thru the methods provided
	 
	 // Constructor
	 public BankAccount(String SSN, double initDeposit) {
		 balance = initDeposit;
		 this.SSN = SSN;
		 id ++;
		 setAccountNumber();
	 }
	 private void setAccountNumber() {
		 int random = (int) (Math.random() * 100);
		  accountNumber = id + "" + random + SSN.substring(0, 2);
		  System.out.println("Your Account Number: " + accountNumber);
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return name;
	 }
	 public void payBill(double amount) {
		 balance = balance - amount;
		 System.out.println("Paying Bill: " + amount);
		 showBalance();
	 }
	 public void makeDeposit(double amount) {
		 balance = balance + amount;
		 System.out.println("Making deposit : " + amount );
		 showBalance(); 
	 }
	 public void showBalance() {
		 System.out.println("Balance: " + balance);
	 }
	 
	 @Override
	  public void accrue() {
		  balance = balance * (1 + rate/100);
		  showBalance();
	  }
	 
	 public String toString() {
		 return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	 }
}
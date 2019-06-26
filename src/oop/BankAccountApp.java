package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		//with encapsulation: public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("12345");		
		System.out.println("SSN: "+ acc1.getSsn());
		
		acc1.accountNumber = "012345";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
	
		acc1.deposit(1500);

		//polymorphism through overriding
		System.out.println(acc1.toString());
		
		//polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "012345665487";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "123456";
		acc3.checkBalance();
		
		//DEMO for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
	 
		
		 }

}

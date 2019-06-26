 package oop;

public class CDAccount extends BankAccount implements Irate{

	String interestRate = "Compounding interest";
	
	void compount() {
		 System.out.println(interestRate);
	}
}

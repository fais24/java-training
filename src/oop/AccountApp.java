package oop;

public class AccountApp {
		public static void main (String [] args) {
			LoanAccount la = new LoanAccount();
			la.increaseRate();
			la.setRate();
			la.setAmmortSchedule();
			la.setTerm(20);
			
			 
			//polymorphism set based on Irate properties but changes where we are pointing
			Irate account1 = new LoanAccount();
			account1.increaseRate();
			account1.setRate();
		}
} 

package oop;

public class LoanAccount implements Irate {
	
	@Override
	public void setRate(){
		System.out.println("Rate");
	}
	@Override
	public void increaseRate() {
		System.out.println("increase rate");
	}
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Amortization schedule");
	}
}

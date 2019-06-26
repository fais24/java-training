package basics;

public class NumbersCalc {
	
	public static void main (String args[]) {
		printName();
		int numA= 10;
		int numB=20;
		
		addNumbers(numA, numB);
		int mOfProduct = multiplyNumbers(numA, numB);
	System.out.println("The product of  the method is : " +mOfProduct);
	}
	
	static void printName() {
		System.out.println("My name is tim");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of: "+numberA +" and "+numberB+" is: "+sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product, product);
		return product;
	}
}

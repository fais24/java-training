package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	void phony() {
		System.out.println(" the phone number of "+name + " is "+phone);
	}
}

public class Demo {

	public static void main (String args[] ) {
		 //Instantiating an object 
		Person person1 = new Person();
		
		//Define some parameters
		person1.name = "Joe";
		person1.email = "joe@test";
		person1.phone = "12345";
		
		//Abstraction
		person1.walk();
		person1.eat();
		person1.phony();
		
		Person person2 = new Person();

		person2.name = "Sarah";
		person2.email = "sar@test.com";
		person2.phone = "123546897";
		
		person2.walk();
		person2.eat();
		person2.phony();
	}
	
	
/*	public static void main(String[] args) {
	String name = "Joe";
	String email = "joe@test.com";
	String phone = "123412341234";
	
	walking(name);
	System.out.println(name + " is eating"); 

	}
	static void walking (String name) {
		System.out.println(name + " is walking");
	}
*/
}


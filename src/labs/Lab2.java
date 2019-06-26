package labs;

public class Lab2 {
	public static void main(String args[]) {
		Student stu1 = new Student("Janelle", "3021654321");
		Student stu2 = new Student("thomas", "2321215455");
		Student stu3 = new Student("elizabeth", "5487452114");
		
		stu1.enroll("Math151");
		stu1.enroll("English255");
		stu1.enroll("History211");
		
		
		//stu1.showCourses(); 
		//stu1.checkBalance();
		stu1.payTuition(600); 
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}
}
class Student{
	//Properties
	//to use encapsulation must be private
	private static int iD ;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
		
	
	public Student(String name, String ssn) {
		 iD++;
		 this.name = name;
		 this.ssn = ssn;
		 setUserId();
		 setEmail();
		 
	}public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;  
	

	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@studentuniversity.com";
		System.out.println("Your email: " + email);
		
	} 
	public String getEmail() {
		return email;
	}
	private void setUserId() {
		 int max = 900;
		 int min = 100;
		 int randNum = (int) (Math.random() * ((max - min)));
		 randNum = randNum + min;
		 userId = iD + "" + randNum + ssn.substring(6);
		 System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
	this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;	
	}
	public void checkBalance() {
	System.out.println("Balace: $" + balance);
	}
	public void showCourses() {
	System.out.println(courses);
	}
	public String toString() {
	return "[NAME:  " + name + " ]\n[COURSES: " + courses + " ]\n[BALANCE:   " + balance + " ]";
	}
	
}
	


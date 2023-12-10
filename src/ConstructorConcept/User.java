package ConstructorConcept;

public class User {

	String firstName;
	String lastName;
	String emailId;
	String phone;
	String password;
	String city;

	// AC:
	// user can be created if you have:
	// FN,LN
	// FN,LN,emailId
	// FN
	// FN,LN,password
	// FN,LN,emailId,phone,password,city

	// method: int taxCal() --business logic
	// constructor:no business logic -- only for object creation -restriction of
	// object creation
	// to initialize the class variables with the initialize values

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public User(String firstName) {
		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String phone, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.password = password;
	}

	public User(String firstName, String lastName, String emailId, String phone, String password, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}
	// static : class name
	// Non Static: object reference name
	// Constant: when we create the object

	public static void main(String[] args) {

		User u1 = new User("Ankit");
		System.out.println(u1.firstName + " " + u1.lastName);
		u1.lastName = "Agarwal";
		System.out.println(u1.firstName + " " + u1.lastName);

		User u2 = new User("Mahesh", "Kumar", "mahesh@gmail.com", "989878285", "Mahesh@123", "Banglore");

		System.out.println(u2.phone);
		u2.city = "Pune";
		u2.password = "mahesh@456";
		System.out.println(u2.firstName + " " + u2.lastName + " " + u2.emailId + " " + u2.phone + " " + u2.password
				+ " " + u2.city);

	}

}

package Encapsulation_Assignment;

public class PersonTest {

	public static void main(String[] args) {
		personData p = new personData();
		p.setName("Yogi");
		p.setAge(22);
		p.setGender("Male");
		p.printInfo(p.getName(), p.getAge(), p.getGender());
	}

}

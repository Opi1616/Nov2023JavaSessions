package MethodConcept;

public class MethodInJava {
	// methods-- class data members

	// 1.no input, no return:
	// void --no return -- function can not return anything
	public void test() {
		System.out.println("test method");
		int i = 10;
		System.out.println(i);
	}

	// 2.no input, but some return:
	// return type: int
	public int totalAmount() {
		System.out.println("Total amount...");
		int i = 10;
		int tax = 5;
		int finalpayment = i + tax;
		return finalpayment;

	}

	public String trainername() {
		System.out.println("tranier name");
		String name = "Naveen";
		return name;

	}

	public char getGender() {
		System.out.println("get gender");
		char c = 'a';
		return c;
	}

	// 3. some input,some return
	public int add(int a, int b) { //method parameter
		System.out.println("adding two numbers...");
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {

		// create the object:
		MethodInJava obj = new MethodInJava();
		obj.test();// calling a method
		int taxAmount = obj.totalAmount();
		System.out.println(taxAmount);
		String tr = obj.trainername();
		System.out.println(tr);

		if (tr.equals("Naveen")) {
			System.out.println("Naveen Automation Labs");
		}

		char gender = obj.getGender();
		System.out.println(gender);
		System.out.println((byte) gender);
		
		int s1=obj.add(10, 20);//arguments --> values
		System.out.println(s1);
		
		int s2=obj.add(20, 50);
		System.out.println(s2-5);

	}
}

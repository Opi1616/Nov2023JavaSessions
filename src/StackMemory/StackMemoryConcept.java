package StackMemory;

public class StackMemoryConcept {
	// NS --NS --Yes(No Object)
	// S-- S-->Yes
	//NS --> S -->:directly/class, no object
	//S --> NS --> need object
	//stack --> LIFO
	//Queue--> FIFO
	//stack --> out of memory: Stack overFlow error
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
		StackMemoryConcept o2 = new StackMemoryConcept();
		// o2.m1();

	}

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		StackMemoryConcept.t1();

	}

	public static void main(String[] args) {
		StackMemoryConcept obj = new StackMemoryConcept();
		obj.m1();
	}

}

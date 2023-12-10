package MethodConcept;

public class Order {

	public int getOrder(String customerName, int price, int tax) {

		// Business logic:
		System.out.println(customerName);
		int k = price + tax;
		return k;
	}

	public int getOrder(String customerName, int price) {

		// Business logic:
		System.out.println(customerName);
		int k = price;
		return k;
	}

	public static void main(String[] args) {
		Order obj = new Order();
		int p = obj.getOrder("Deepa", 1000, 30);
		System.out.println(p);

		int f = obj.getOrder("naveen", 4000);
		System.out.println(f);

	}

}

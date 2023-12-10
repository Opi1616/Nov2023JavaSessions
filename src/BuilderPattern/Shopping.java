package BuilderPattern;

public class Shopping {

	public Shopping login() {
		System.out.println("login to app");
		return this;//current class shopping object
	}

	public Shopping login(String un, String pwd) {
		System.out.println("login to app with" + un + " " + pwd);
		return this;
	}

	public Shopping search() {
		System.out.println("product search");
		return this;
	}

	public Shopping search(String name) {
		System.out.println("product search: " + name);
		return this;
	}

	public Shopping addToCart(String name) {
		System.out.println("adding to cart: " + name);
		return this;
	}

	public Shopping doPayement(String cc, int cvv) {
		System.out.println("mayking payment with: " + cc + " " + cvv);
		return this;
	}

	public Shopping doPayement(String upi) {
		System.out.println("mayking payment with: " + upi);
		return this;

	}
	
	public Shopping logOut() {
		System.out.println("User logout");
		return this;

	}

	public Shopping genrateOrder() {
		System.out.println("order id id 12345");
		return this;
	}
}

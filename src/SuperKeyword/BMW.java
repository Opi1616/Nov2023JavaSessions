package SuperKeyword;

public class BMW extends Car {

	private int min_speed = 200;

	public void speedCal() {
		System.out.println(min_speed);// BMW
		
		int carSpeed = super.min_speed;
		int diff = min_speed-carSpeed;
		System.out.println(diff);
	}
	@Override
	public void diplay() {
		System.out.println("BMW -- display");
		super.diplay();
	}

	public BMW() {
		super("BMW x1", 40);
		System.out.println("BMW Constructor");
	}

	public BMW(int price) {
		super("Audi", 50);
		System.out.println("BMW Constructor");
	}
}

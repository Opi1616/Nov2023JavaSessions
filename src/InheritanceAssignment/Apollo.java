package InheritanceAssignment;

public class Apollo extends Hospital {
	@Override
	public void physiotherapy() {
		System.out.println("physio_therapy -- Apollo Hosptial");
	}

	@Override
	public void emergency() {
		System.out.println("emergency --Apollo Hosptial");
	}

	public void radiology() {
		System.out.println("radiology --Apollo Hosptial");

	}

	public void Laboratory() {
		System.out.println("Laboratory --Apollo Hosptial");

	}
}

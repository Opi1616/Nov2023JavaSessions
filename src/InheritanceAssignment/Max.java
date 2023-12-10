package InheritanceAssignment;

public class Max extends Hospital {
	@Override
	public void physiotherapy() {
		System.out.println("physio_therapy -- Max Hosptial");
	}

	@Override
	public void emergency() {
		System.out.println("emergency --Max Hosptial");
	}

	public void dental() {
		System.out.println("dental --Max Hosptial");
	}

	public void care() {
		System.out.println("care --Max Hosptial");
	}
}

package InheritanceAssignment;

public class Fortis extends Hospital {
	@Override
	public void physiotherapy() {
		System.out.println("physio_therapy -- Fortis Hosptial");
	}

	@Override
	public void emergency() {
		System.out.println("emergency --Fortis Hosptial");
	}

	public void Maternity() {
		System.out.println("Maternity --Fortis Hosptial");
	}

	public void surgical() {
		System.out.println("surgical --Fortis Hosptial");
	}
}

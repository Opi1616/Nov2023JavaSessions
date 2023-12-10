package InheritanceAssignment;

public class TestAllHospital {

	public static void main(String[] args) {
		Fortis fs = new Fortis();
		fs.physiotherapy();
		fs.Maternity();
		fs.Behavior_therapy();

		System.out.println("-----------");
		// child class object can be referred by parent class ref variable:
		// top casting: can access only overridden and inherited methods
		Hospital hp = new Fortis();
		hp.physiotherapy();
		hp.emergency();
		hp.Behavior_therapy();

		// Apollo ap = (Apollo) new Hospital();//ClassCastException
		// ap.Laboratory();
		System.out.println("-----------");
		Hospital mx = new Max();
		mx.Behavior_therapy();
		mx.physiotherapy();
		System.out.println("-----------");
		
		Max m = new Max();
		m.dental();

	}

}

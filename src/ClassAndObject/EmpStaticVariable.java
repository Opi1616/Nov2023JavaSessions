package ClassAndObject;

public class EmpStaticVariable {
	
	static String ceoname="Ramesh";
	static String companyname="HP";
	int empcode;
	String empname;
	char detgrade;
	String projectname;
	int totalprojects;
	int totaldept;
	int totalemp;
	int totalfaculty;
	

	public static void main(String[] args) {
		EmpStaticVariable var = new EmpStaticVariable();
		EmpStaticVariable var1 =new EmpStaticVariable();
		EmpStaticVariable var2 = new EmpStaticVariable();
		
		var.empname="Rohit";
		System.out.println(EmpStaticVariable.companyname);
		System.out.println(EmpStaticVariable.ceoname);
    
		EmpStaticVariable.ceoname="naveen";
		System.out.println(EmpStaticVariable.ceoname);

		var1.totalfaculty=100;
		System.out.println(var1.totalfaculty);

}

}

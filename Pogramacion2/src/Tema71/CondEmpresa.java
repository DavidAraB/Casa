package Tema71;

public class CondEmpresa {

	/*public static void main(String[] args) {
		
	Empleados emp = new Empleados();
	Jefe jefe= new Jefe();
	emp.pedirDatos("Pedro", 18, 1);
	jefe.pedirDatos("David", 19, 5, 100, "Teleco");
	emp.verDatos();
	jefe.verDatos();
	
	}*/
	
	
	public static void main(String [] args) {
		Empleados emp =new Empleados("Pedro", 18, 1);
		Jefe jefe=new Jefe("David", 19, 5, "Teleco");
		System.out.println(emp.verDatos());
		System.out.println(jefe.verDatos());
		emp.modSueldobase(10);
		Empleados emp2 =new Empleados("Pedro2", 18, 1);
		Jefe jefe2=new Jefe("David2", 19, 5, "Teleco2");
		System.out.println(emp2.verDatos());;
		System.out.println(jefe.verDatos());;
		jefe.modPlus(300);
		System.out.println(jefe.verDatos());;
	}

}

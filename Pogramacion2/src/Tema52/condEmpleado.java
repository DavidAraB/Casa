package Tema52;

public class condEmpleado {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado("david", 18);
		emp.leerDatos();
		emp.modDatos("pedro", 22);
		emp.leerDatos();
		emp.setNombre("mark");
		emp.setNumEmp(0);
		emp.leerDatos();

}}

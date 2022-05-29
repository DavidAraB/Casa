package Tema71;

public class Jefe extends Empleados{

	
	/*float plusJefe;
	String depto;
	
	public Jefe() {};
	public Jefe(String nombreEmp, int edad, float incremento, float plusJefe, String depto) {
		super(nombreEmp, edad, incremento);
		this.plusJefe=plusJefe;
		this.depto=depto;
		sueldo=sueldoBase+(sueldoBase*incremento/100)+plusJefe;	
	}
	
	public void pedirDatos (String nombre, int edad, float incremento, float plusJefe, String depto) {
		super.pedirDatos(nombre, edad, incremento);
		this.plusJefe=plusJefe;
		this.depto=depto;
		sueldo=sueldoBase+(sueldoBase*incremento/100)+plusJefe;	
	}
	
	public void verDatos() {
		System.out.println("Nombre: "+ nombreEmp+" edad: "+edad+" sueldo: "+sueldo+" plus: "+plusJefe+" depto: "+depto);
	}*/
	
	String depto;
	static float plusjefe=250;
	public Jefe(String nombre, int edad, float incremento, String depto) {
		super(nombre, edad, incremento);
		this.depto=depto;
		sueldo+=plusjefe;
	}
	
	public void modPlus(float plus) {
		this.sueldo+=(plus-plusjefe);	
		this.plusjefe=plus;
	
	}
	
	public String verDatos() {
		return super.verDatos()+" del departamento "+depto+" con un  plus de "+plusjefe;
	}
}

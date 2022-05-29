package Tema71;

/*public class Empleados {
final String nombreEmpresa="Eléctrica SA";
String nombreEmp;
int edad;
float sueldoBase=1000, incremento,sueldo;
	public Empleados() {};
		public Empleados(String nombreEmp, int edad, float incremento) {
			this.nombreEmp=nombreEmp;
			this.edad=edad;
			this.incremento=incremento;
			sueldo=sueldoBase+(sueldoBase*incremento/100);	
		}
		
		public void pedirDatos(String nombreEmp, int edad, float incremento) {
			this.nombreEmp=nombreEmp;
			this.edad=edad;
			this.incremento=incremento;
			sueldo=sueldoBase+(sueldoBase*incremento/100);	
		}
		public void modSueldoBase(float sueldoBase) {
			this.sueldoBase=sueldoBase;
		}
		
		public void verDatos(){
			System.out.println("Nombre: "+ nombreEmp+" edad: "+edad+" sueldo: "+sueldo);
		}
		
}*/
//Hecho pa repasar x segunda vez, supongo que lo de antes estaba bien, no lo he mirado

public class Empleados{
	
	final String empresa="Eléctrica SA";
	String nombre; 
	int edad;
	static float sueldobase=1000;
	 float incremento,sueldo;
	
	
	public Empleados(String nombre, int edad, float incremento) {
		this.nombre=nombre;
		this.edad=edad;
		this.incremento=incremento;
		sueldo= sueldobase+(sueldobase*(incremento/100));
	}
	
	public void modSueldobase(float sueldoba) {
		sueldobase=sueldoba;
	}
	
	public String verDatos() {
		return "El nombre del empleado es: "+nombre+" de edad: "+edad+" su sueldo es: "+sueldo;
	}
	
}

package Tema52;

public class Empleado {
String nombre;
int numEmp;

	public Empleado(String nombre, int numEmp) {
		this.nombre=nombre;
		this.numEmp=numEmp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}
	public void leerDatos() {
		System.out.println("Los datos del empleado son: Nombre:"+getNombre()+" Numero emp:"+ getNumEmp());
	}
	public void modDatos(String nombre, int numEmp) {
		this.nombre=nombre;
		this.numEmp=numEmp;
	}
}

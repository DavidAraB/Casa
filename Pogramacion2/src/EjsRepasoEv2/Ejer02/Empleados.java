package EjsRepasoEv2.Ejer02;

import java.util.Scanner;

public class Empleados implements Pedirdatos{

	Scanner tec = new Scanner(System.in);
	
	String nombre;
	int edad;
	static float sueldobase=1000;
	public Empleados() {
		pedirDatos();
	}
	
	public void pedirDatos() {
		System.out.println("dime el nombre");
		nombre=tec.next();
		System.out.println("dime la edad");
		edad=tec.nextInt();
	}
	
	@Override
	public String verDatos() {	
		return "Nombre: "+nombre+" edad: "+edad;
	}
	


}

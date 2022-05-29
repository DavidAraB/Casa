package EjsRepasoEv2.Ejer02;

import java.util.Scanner;

public class CondEjer02 {

	
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		/*
		 int empleado, maquinista, administrativa;
		System.out.println("Dime el n de empleados");
		empleado=tec.nextInt();
		System.out.println("Dime el n de administrativos");
		administrativa=tec.nextInt();
		System.out.println("Dime el n de maquinistas");
		maquinista=tec.nextInt();
		*/
		//Paso de la parte de decir cunatos empleados...
		Empleados emp = new Empleados();
		Administrativos adm = new Administrativos();
		Maquinistas maq = new Maquinistas();
		System.out.println(emp.verDatos());
		System.out.println(adm.verDatos());
		System.out.println(maq.verDatos());

	}

}

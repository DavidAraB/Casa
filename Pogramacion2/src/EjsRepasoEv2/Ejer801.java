package EjsRepasoEv2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer801 {

	Scanner tec = new Scanner(System.in);

	String nombre;
	int edad;
	float altura;
	
	public Ejer801() throws IOException {
		pedirDatos();
	}
	
	public void pedirDatos() throws IOException {
		System.out.println("Dime el nombre");
		nombre= tec.next();
		
		try {
			do {

				System.out.println("dime la edad");
				edad=tec.nextInt();
			}while(edad<=0);
		}catch(InputMismatchException e){
			throw new IOException("No metas letras mongolo");
		}
		
		try {
			do {

				System.out.println("dime la altura");
				altura=tec.nextInt();
			}while(altura<=0);
		}catch(InputMismatchException e){
			throw new IOException("No metas letras mongolo");
		}
	}

	public void verDatos() {
		System.out.println(nombre+" "+edad+" "+altura);
	}
	
	public String masAlto(Ejer801 persona) {
		if(edad<persona.edad)return"Es mas alto "+persona.nombre;
		else if(edad>persona.edad)return "Es mas alto "+nombre;
		else return"Son iguales";
		
	}
	public static void main(String[] args) {
		Ejer801 per1;
		Ejer801 per2;
		try {
			per1 = new Ejer801();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return;
		}
		try {
			per2 = new Ejer801();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return;
		}
		per1.verDatos();
		per2.verDatos();
		System.out.println(per1.masAlto(per2));
		
	}

}

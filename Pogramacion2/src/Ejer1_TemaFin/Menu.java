package Ejer1_TemaFin;

import java.util.Scanner;

public class Menu {

	Scanner tec= new Scanner(System.in);
	int opcion;
	String fichero;
	Administrar t;
	
	public Menu(String fichero) {
		this.fichero=fichero;
		t = new Administrar(fichero);
		do {
			menu();
			opcion= tec.nextInt();
			elige(opcion);


		}while(opcion!=7);
	}

	public void menu() {

		System.out.println("1. Añadir Vehiculo\r\n"
				+ "2. Eliminar vehiculo\r\n"
				+ "3. Añadir sancion\r\n"
				+ "4. Consulta sanciones\r\n"
				+ "5. Elimina sanciones \r\n"
				+ "6. Listado de sanciones cuya cantidad sea mayor a la determinada\r\n"
				+ "7. Terminar el programa");
	}

	public void elige(int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("añadir vehiculo");
			break;
		case 2:
			System.out.println("eliminar vehiculo");
			break;
		case 3:
			System.out.println("añade sancion");
			break;
		case 4:
			System.out.println("consulta sancion");
			break;
		case 5:
			System.out.println("elimina sanciones");
			break;
		case 6:
			System.out.println("Listado de sanciones cuya cantidad sea mayor a la determinada");
			t.multasMayores(1000,fichero);
			break;
		case 7:
			System.out.println("Finaliza");
			break;
		}}

	public static void main(String [] args) {
		Menu menu = new Menu("coches.txt");
	}


}

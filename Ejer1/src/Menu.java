import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	Scanner tec = new Scanner(System.in);
	
	String fichero="agenda.dat";
	String nombre,apellidos,telefono,tipotelefono;
	int opcion;
	Agenda a;
	public Menu() {
		
		a = new Agenda(fichero);

		do {
			menu();
			opcion=tec.nextInt();
			trabajo(opcion);
			a.escribeFichero(fichero, a.contactos);
		}while(opcion!=0);

	}
	private void menu() {
		System.out.println("0. Salir del programa\n"
				+ "1. A?adir contacto\n"
				+ "2. Borrar contacto\n"
				+ "3. Listado en orden alfabetico\n"
				+ "4. Buscar por nombre\n"
				+ "5. A?adir telefono\n"
				+ "6. Borrar telefono\n"
				+ "7. Buscar por telefono\n");
	}

	private void trabajo(int opcion) {
		switch(opcion) {

		case 0: break;
		case 1:
			System.out.println("Dime el nombre de tu contacto");
			nombre=tec.next();
			System.out.println("Dime los apellidos de tu contacto");
			apellidos=tec.next();
			if(a.a?adeContacto(nombre, apellidos)) System.out.println("A?adido con ?xito");
			break;
		case 2:
			System.out.println("Dime el nombre de tu contacto");
			nombre=tec.next();
			System.out.println("Dime los apellidos de tu contacto");
			apellidos=tec.next();
			if(a.borrarContacto(nombre, apellidos)) System.out.println("Borrado con ?xito");
			else System.out.println("Error");
			break;
		case 3:
			//System.out.println("Orden alfabetico por hacer");
			a.ordenaAlf();
			break;
		case 4:
			System.out.println("Dime el nombre de tu contacto");
			nombre=tec.next();
			System.out.println("Dime los apellidos de tu contacto");
			apellidos=tec.next();
			System.out.println(a.buscarNombre(nombre, apellidos));  ;
			break;
		case 5:
			System.out.println("Dime el nombre de tu contacto");
			nombre=tec.next();
			System.out.println("Dime los apellidos de tu contacto");
			apellidos=tec.next();
			System.out.println("Dime el numero de tu contacto");
			telefono=tec.next();
			System.out.println("Dime el tipo de telefono de tu contacto");
			tipotelefono=tec.next();
			a.a?adirTelefono(nombre, apellidos, telefono, tipotelefono);
			break;
		case 6:
			System.out.println("Dime el nombre de tu contacto");
			nombre=tec.next();
			System.out.println("Dime los apellidos de tu contacto");
			apellidos=tec.next();
			System.out.println("Dime el numero que deseas borrar de tu contacto");
			telefono=tec.next();
			a.borraNumero(nombre, apellidos, telefono);
			break;
		case 7:
			System.out.println("Dime el numero que deseas buscar");
			telefono=tec.next();
			a.buscaTelefono(telefono);
			break;
		}
	}	

}

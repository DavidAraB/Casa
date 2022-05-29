package Ejer02TemaFin;

import java.util.Scanner;

public class Menu {
	Scanner tec= new Scanner(System.in);
	int opcion;
	String fichero="src/viajantes.txt";
	Administracion a;
	String DNI, nombre;
	int ventasHechas,distancia,antiguedad;
	String fecha,cliente;
	float importe;
	public Menu() {
		
		a= new Administracion(fichero);
		do {
			menu();
			opcion= tec.nextInt();
			elige(opcion);
			a.escribeFichero(fichero, a.viajantes);

		}while(opcion!=9);
	}

	public void menu() {

		System.out.println("1. Añadir un viajante\r\n"
				+ "2. Eliminar un viajante\r\n"
				+ "3. Mostrar un listado de todos los viajantes, indicando la distancia recorrida y el importe acumulado de\r\n"
				+ "las ventas cobradas\r\n"
				+ "4. Inicializar ventas\r\n"
				+ "5. Incrementar la distancia recorrida por un viajante \r\n"
				+ "6. Añadir una venta de un viajante\r\n"
				+ "7. Cobrar una venta de un viajante\r\n"
				+ "8. Mostrar un listado de todas las ventas no cobradas de un viajante\n"
				+ "9. Terminar el programa");
	}
	
	public void elige(int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("dime el DNI del viajante");
			DNI=tec.next();
			System.out.println("dime el nombre del viajante");
			nombre=tec.next();
			System.out.println("dime la antiguedad del viajante");
			antiguedad=tec.nextInt();
			System.out.println("dime la distancia del viajante");
			distancia=tec.nextInt();
			System.out.println("dime las ventas del viajante");
			ventasHechas=tec.nextInt();
			if(a.añadeViajante(DNI, nombre, antiguedad, ventasHechas, distancia))System.out.println("añadido con exito");;
			break;
		case 2:
			System.out.println("DNI viajante");
			DNI=tec.next();
			a.borraViajante(DNI);
			break;
		case 3:
			System.out.println("datos del viajante");
			a.listado();
			break;
		case 4:
			System.out.println("inicializar ventas");
			a.inicializaVentas();
			break;
		case 5:
			System.out.println("incrementar distancia viajante");
			System.out.println("DNI viajante");
			DNI=tec.next();
			System.out.println("Distancia viajante");
			distancia=tec.nextInt();
			a.incrementaDistancia(DNI, distancia);
			break;
		case 6:
			System.out.println("añadir venta al viajante de DNI:");
			DNI=tec.next();
			System.out.println("Fecha venta");
			fecha=tec.next();
			System.out.println("importe venta");
			importe=tec.nextInt();
			System.out.println("cliente de la venta");
			cliente=tec.next();;
			a.añadeVenta(DNI, fecha, cliente, importe);
			break;
		case 7:
			System.out.println("cobrar venta viajante");
			System.out.println("DNI viajante");
			DNI=tec.next();
			System.out.println("Fecha venta");
			fecha=tec.next();
			System.out.println("importe venta");
			importe=tec.nextInt();
			System.out.println("cliente de la venta");
			cliente=tec.next();
			a.cobraVenta(DNI, fecha, importe, cliente);
			break;
		case 8:
			System.out.println("ventas no cobradas viajante");
			System.out.println("DNI viajante");
			DNI=tec.next();
			a.listaPorCobrar(DNI);
			break;
		case 9: 
			System.out.println("termina");
			break;
		}
	}
	
}
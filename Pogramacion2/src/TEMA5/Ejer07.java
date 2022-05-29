package TEMA5;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dos numeros, el primero sera el radio y el segundo podra ser(1 para circunferencia, 2 area, 3 volumen esfera)");
		int radio=teclado.nextInt(),opcion=teclado.nextInt();
		System.out.println("El resultado de la opercaion elegida es: " + opRadio(radio,opcion));

	}
public static double opRadio(double radio, int opcion) {
	double resultado=0;
	final double pi=3.1416;
	switch (opcion) {
	case 1 : resultado = 2*pi*radio; break;
	case 2 : resultado = pi*radio*radio; break;
	case 3 : resultado = 4/3 *pi*radio*radio*radio; break;
	default: resultado = 0000;
	}
	return resultado;
	}

}


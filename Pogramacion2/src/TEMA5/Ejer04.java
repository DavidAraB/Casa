package TEMA5;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		System.out.println("Dame un numero para saber si es primo");
		Scanner teclado = new Scanner(System.in);
		int n=teclado.nextInt();
		NumPrimo(n);
	

	}

	public static void NumPrimo (int n) {
		int cont=1;
		for(int m=n; cont<m;++cont) {
			if(Ejer01.esPrimo(cont))System.out.println(cont);
		}
	}
}

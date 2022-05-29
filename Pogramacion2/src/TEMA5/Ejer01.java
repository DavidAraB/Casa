package TEMA5;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		System.out.println("Dame un numero para saber si es primo");
		Scanner teclado = new Scanner(System.in);
		int num=teclado.nextInt();
		boolean primo;
		primo= esPrimo(num);
		if(primo==true) System.out.println("es primo");
		if(primo==false) System.out.println("no es primo");
	}



	public static boolean esPrimo (int n) {
		int c=0, i=n-1;
		while(i>1) {
			if(n%i==0) {
				++c;
			};
			--i;
		}
		if (c!=0) {
			return false;
		}
		else return true;
	}

}

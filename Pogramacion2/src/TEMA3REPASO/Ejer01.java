package TEMA3REPASO;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		int num1, num2, suma=0;
		Scanner teclado = new Scanner(System.in);
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		for( int cont = num1+1;cont<num2;++cont) {
			suma+=cont;
		}
		System.out.println("Suma= "+suma);
	}
}

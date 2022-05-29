package TEMA3REPASO;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		int num, suma=0, veces=0;
		Scanner teclado = new Scanner(System.in);
		num=teclado.nextInt();
		while(num!=0) {
			suma=suma+num;
			++veces;
			
			num=teclado.nextInt();
		}
		System.out.println("La suma es: "+suma+" y se ha introducido: "+ veces);
	}
}

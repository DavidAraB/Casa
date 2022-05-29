package TEMA3REPASO;

import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero,max,min,media=0,veces=0;
		numero= teclado.nextInt();
		max=numero;
		min=numero;
		while(numero!=0) {
			++veces;
			media=(media+numero)/veces;
			if(numero<min) {
				min=numero;
			}
			if(numero>max) {
				max=numero;
			}
			numero=teclado.nextInt();
		}
		System.out.println("La media es: "+media+"EL máximo es: "+max+"y el minimo es: "+min);
	}
}

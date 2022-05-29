package TEMA3REPASO;

import java.util.Scanner;

public class Ejer09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num,cont,suma=0;
		num = teclado.nextInt();
		cont = num;
		while(cont  > 1 ) {
			--cont;
			
			if(num % cont == 0) {
				suma=suma+cont;
				
				}
		}
		if(suma==num) {
			System.out.println("el numero es perfecto");
		}
	}

}

package TEMA3REPASO;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sumapar=0,sumaimpar=0, veces=0;
		Scanner teclado = new Scanner(System.in);
		num=teclado.nextInt();
		while(num!=0) {
			++veces;
			if(veces%2==0) {
				sumapar=sumapar+num;
			}else {
				sumaimpar= sumaimpar+num;
			}
			num=teclado.nextInt();
		}
		System.out.println("La suma par es: "+sumapar);
		System.out.println("La suma impar es: "+sumaimpar);
	}

}

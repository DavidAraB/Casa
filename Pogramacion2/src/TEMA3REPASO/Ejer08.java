package TEMA3REPASO;

import java.util.Scanner;

public class Ejer08 {
	public static void main(String[]args) {
		Scanner teclado= new Scanner(System.in);
		int num,resul=1;
		for(num=teclado.nextInt();num>0;--num) {
			resul=resul*num;
		}
		System.out.println("El factorial es: "+resul);
	}
}

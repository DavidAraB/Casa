package TEMA4REPASO;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String texto,cadenapar=(""), cadenaimpar=("");
		texto= teclado.nextLine();
		char letra;
		int posicion=0,max=texto.length();
		for(posicion=0;max<=80 && posicion!= max;posicion++) {
			
			if(posicion%2==0)cadenapar=cadenapar+texto.charAt(posicion);
			if(posicion%2!=0)cadenaimpar=cadenaimpar+texto.charAt(posicion);
		}
		System.out.println(cadenapar);
		System.out.println(cadenaimpar);
	}
}

package TEMA4REPASO;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String texto, frase="";
		int pos=0;
		texto=teclado.nextLine();
		texto=texto.toUpperCase();
		char letra = texto.charAt(pos);;
		
		for(pos=0;pos!=texto.length();++pos) {
			letra=(char) (texto.charAt(pos)+3);
			frase = frase + letra;
		}
		System.out.print(frase);
	}

}

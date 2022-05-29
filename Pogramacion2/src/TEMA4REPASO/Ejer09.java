package TEMA4REPASO;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String texto, frase="";
		int pos=0,n;
		texto=teclado.nextLine();
		n=teclado.nextInt();
		texto=texto.toUpperCase();
		char letra = texto.charAt(pos);;
		
		for(pos=0;pos!=texto.length();++pos) {
			letra=(char) (texto.charAt(pos)+n);
			frase = frase + letra;
		}
		System.out.print(frase);
	}

}

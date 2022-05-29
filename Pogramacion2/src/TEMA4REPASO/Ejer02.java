package TEMA4REPASO;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		String texto;
		char letra;
		Scanner teclado = new Scanner(System.in);
		int mayus=0,minus=0,max,pos;
		texto= teclado.nextLine();
		max=texto.length();
		for(pos=0;max<=80 && pos!= max;++pos) {
			letra=texto.charAt(pos);
			if(letra>=97) {
				minus++;
			}
			else if(letra>64) {
				mayus++;
			}	
}
		System.out.println("MAyus: "+mayus);
		System.out.println("Minus: "+minus);
	}
}

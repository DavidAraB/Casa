package TEMA4REPASO;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String texto;
		int max, pos, cont=0;
		char letra ='A';
		texto = teclado.nextLine();
		max=texto.length();
		texto=texto.toUpperCase();
		while (letra>='A'&&letra<='Z') {
			for(pos=0;pos!=max && max<=60;++pos) {
				if(letra==texto.charAt(pos)) {
					cont++;
				}
				
			}
			if(cont>0)System.out.println("la letra"+letra+"ha salido "+ cont);
			++letra;
			cont=0;
		}

	}

}

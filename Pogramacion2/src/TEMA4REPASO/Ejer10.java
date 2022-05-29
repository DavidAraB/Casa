package TEMA4REPASO;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String codigo, codigofin;
		codigofin="00000000";
		int max;
		char letra;
		codigo = teclado.nextLine();
		max=codigo.length();
		while(max==8 && codigo != codigofin) {
			letra= codigo.charAt(0);
			if(letra=='1') {}
			
			
			letra= codigo.charAt(1);
			if(letra=='9') {}
			
			
			letra= codigo.charAt(2);
			if(letra=='9') {}
			
			
			letra= codigo.charAt(3);
			if(letra>='0' && letra<='5') {System.out.println("El año de nacimiento es: 199"+letra);}
			
			
			letra= codigo.charAt(4);
			if(letra=='H') {System.out.println("Hombre");}
			else if(letra=='M') {System.out.println("Mujer");}
			
			
			letra= codigo.charAt(5);
			if(letra=='1') {System.out.println("Primer año");}
			else if(letra=='2') {System.out.println("Segundo año");}

			codigo = teclado.nextLine();
		}
	}}



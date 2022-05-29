package TEMA4REPASO;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String texto;
		char letra;
		int posicion=0,vocales=0,consonantes=0,numeros=0;
		texto = teclado.nextLine();
		texto=texto.toLowerCase();
		while(posicion!=texto.length()) {
			letra=texto.charAt(posicion);
			if(letra=='a'|| letra=='e'||letra=='i'||letra=='o'||letra=='u') {
				++vocales;}
				else if(letra>='a'&&letra<='z') {
					++consonantes;}
					else if(letra>=48&&letra<=57){
					++numeros;}
			++posicion;
		}
		System.out.println("Vocales "+vocales);
		System.out.println("Vocales "+consonantes);
		System.out.println("Vocales "+numeros);
	}
}

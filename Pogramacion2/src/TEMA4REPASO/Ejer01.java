package TEMA4REPASO;

import java.util.Scanner;

public class Ejer01 {
public static void main(String[] args){
	String texto,frase="";
	Scanner teclado = new Scanner(System.in);
	int max,cont;
	texto= teclado.nextLine();
	max=texto.length();
	for(cont=0;cont!=max && max<=80;++cont) {
	frase=frase+texto.charAt(cont);	
	System.out.println(frase);
	}
	
}
}

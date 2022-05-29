package TEMA4REPASO;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String texto, resul="";
	texto = teclado.nextLine();
	int max, pos=0, cont=0, pos2=texto.length();
	char letra ='A';
	max=texto.length();
	texto=texto.toUpperCase();
	while(pos2>0) {
		resul="";
		for(pos=0;pos<max-1 && max<=20;++pos) {
			resul = resul + texto.charAt(pos);
		}
		texto=texto.charAt(max-1)+resul;
		System.out.println(texto);
		--pos2;
	}	
}
}

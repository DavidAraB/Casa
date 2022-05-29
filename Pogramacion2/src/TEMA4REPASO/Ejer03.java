package TEMA4REPASO;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		String texto,palabra="",palabratexto="";
		Scanner teclado = new Scanner(System.in);
		int cont = 0, posicion=1,pos=0;
		texto= teclado.nextLine();
		palabra=teclado.next();
		int m;
		while(cont==0){
			for (m=texto.length();pos!=m && texto.charAt(pos)>64;++pos){
				palabratexto=palabratexto+texto.charAt(pos);
			}
			
			if(palabratexto.equals(palabra)) {
				System.out.println("Está en la posicion: "+posicion);
				++cont;
			}else {palabratexto="";
				++posicion;}
		++pos;
		}
		}}
		

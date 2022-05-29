package TEMA3REPASO;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		int num, cont, primo=0;
		Scanner teclado= new Scanner(System.in);
		num=teclado.nextInt();
		cont=num-1;
		while(cont>1) {
			if(num%cont==0) {
				++primo;
				};
				--cont;
			
			if(primo==0)System.out.println("El numero "+num+" es primo");
			primo=0;
		}
			
		while(primo!=0) {
			if(num%cont==0) {
				++primo;
				};
				--cont;
			if(primo==0)
			++num;
		}
		}
		
	
}

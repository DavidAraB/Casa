package TEMA5;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero para hacer su factorial");
		int n= teclado.nextInt();
		if(n>=1)System.out.println(factorial(n));
		else System.out.println("el numero no es valido");
		
	}

	public static int factorial(int n) {
		int cont, factorial=1;
		if(n>0) {
			for(cont=1;cont<=n;++cont){
				
				factorial= factorial * cont;
			}
			return factorial;
		}
		else return -1;
	}
}

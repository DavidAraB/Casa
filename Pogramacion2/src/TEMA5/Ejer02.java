package TEMA5;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime dos numeros para ver cual tiene mas divisores");
		int P= teclado.nextInt();
		int Q= teclado.nextInt();
		switch(Divisor(P,Q)) {
		case 0 : System.out.println("numeros no validos");break;
		case 1 : System.out.println(P+" tiene mas divisores que "+Q);break;
		case 2 : System.out.println(Q+" tiene mas divisores que "+P);break;
		case 3 : System.out.println(P+" tiene el mismo numero de divisores que "+Q);break;
		}
	}

	public static  int Divisor(int P, int Q) {
		int c1=0,c2=0,i1,i2;
		i1=P;
		i2=Q;
		while( i1 > 1 ) {
			--i1;
			if(P % i1 == 0) {
				c1++;
			}
		}
		while( i2 > 1 ) {
			--i2;
			if(Q % i2 == 0) {
				c2++;
			}
		}
		if(c1>c2)return 1;
		else if(c1<c2)return 2;
		else if(c1==c2) return 3;
		else return 0;
	}
}
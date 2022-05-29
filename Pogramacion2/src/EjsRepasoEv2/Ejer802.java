package EjsRepasoEv2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer802 {
	Scanner tec = new Scanner(System.in);

	int numero, suma=0, contador=0;
	String cadena="";
	boolean correcto=true;
	public Ejer802(){
		do{
		try {
			pedirNum();
		}catch(InputMismatchException e) {
			try {
				pedirCadena();
			}catch(IOException e1) {
			//System.out.println("mongolo");
			throw new InputMismatchException("Mongolo");
			//correcto=false;
			}
		}
		}while(contador<6 && correcto==true);
	}
	
	
	public void pedirNum() throws InputMismatchException {
		
			try {
				System.out.println("dime un numero");
				numero=tec.nextInt();
				suma+=numero;
				++contador;
			}catch (InputMismatchException e) {
				throw new InputMismatchException("No metas letras capullo");
			}

		//}while(contador<6);
	}
	
	public void pedirCadena() throws IOException {
		String cadena2;
		try {
			System.out.println("Dame una cadena");
		cadena2=tec.nextLine();
		for(int i=0; i<=cadena.length()&&contador<6;++i) {
			if(cadena.charAt(i)<='9' && cadena.charAt(i)>='0' && contador<6) {
				numero=Integer.valueOf(cadena.charAt(i));
						suma+=numero;
						contador++;
		}else throw new IOException ("Acho ni en cadenas sabes meter numeros");
		
			}
		}catch(IOException e) {
			throw new IOException("No es valido");
		}
	}
	
	public int verSuma() {
		return suma;
	}

	public static void main(String[] args) {
		Ejer802 obj=new Ejer802();
		System.out.println(obj.verSuma()); ;
	/*	try {
			obj ;
		}catch()*/

	}

}

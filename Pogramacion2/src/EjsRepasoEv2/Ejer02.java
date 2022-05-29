package EjsRepasoEv2;

import java.util.Random;

public class Ejer02 {

	Random r = new Random();	
	int [] numeros = new int[20];
	
	public  void rellenarNumeros() {
		for(int i=0; i<numeros.length;++i) {
			numeros[i]=r.nextInt(100)+1;
			System.out.println(numeros[i]);
		}
	}
	
	public void ordenar() {
		boolean ordenado =false;
		int aux=0;
		
			for(int i=0;i<numeros.length-1;i++) {
			if(numeros[i]%2!=0) {
				if(numeros[i+1]%2==0) {
					numeros[i]=aux;
					numeros[i]=numeros[i+1];
					numeros[i+1]=aux;
					ordenado=false;
				}
			}
		}
	}
	
	public void verVector(){
		for(int i=0;i<numeros.length;++i) {
			System.out.println(numeros[i]);
		}
	}
	
	public static void main(String[] args) {
		Ejer02 obj = new Ejer02();
		obj.rellenarNumeros();
		obj.ordenar();
		System.out.println("----------------------------------");
		obj.verVector();
	}

}

package EjsRepasoEv2;

import java.util.Random;

public class Ejer01 {
	
	Random r = new Random();
	
	int [] numeros = new int[20];
	int [] cuadrado = new int[20];
	int [] cubo = new int[20];
	
	public  void rellenarNumeros() {
		for(int i=0; i<numeros.length;++i) {
			numeros[i]=r.nextInt(100)+1;
			System.out.println(numeros[i]);
		}
	}
	
	
	public void cuadrado() {
		for(int i=0; i<numeros.length;++i) {
			cuadrado[i]=numeros[i]*numeros[i];
			System.out.println(cuadrado[i]);
		}
	}
	
	public void cubo() {
		for(int i=0; i<numeros.length;++i) {
			cubo[i]=cuadrado[i]*numeros[i];
			System.out.println(cubo[i]);
		}
	}
	
	public static void main(String[] args) {
		Ejer01 obj = new Ejer01();
		obj.rellenarNumeros();
		System.out.println("------------------------");
		obj.cuadrado();
		System.out.println("------------------------");
		obj.cubo();
	}
}

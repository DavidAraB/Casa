package EjsRepasoEv2;

import java.util.Random;

public class Ejer03 {

	Random r = new Random();
	int [] numeros = new int[100];
	
	public  void rellenarNumeros() {
		for(int i=0; i<numeros.length;++i) {
			numeros[i]=r.nextInt(500)+1;
			System.out.println(numeros[i]);
		}
	}
	
	public int getMaximo() {
		int maximo=0;
		for(int i=0; i<numeros.length;++i) {
			if(numeros[i]>maximo)
				maximo=numeros[i];
		}
		return maximo;
	}
	public int getMinimo() {
		int minimo=500;
		for(int i=0; i<numeros.length;++i) {
			if(numeros[i]<minimo)
				minimo=numeros[i];
		}
		return minimo;
	}
	
	public static void main(String[] args) {
		Ejer03 obj =new Ejer03();
		obj.rellenarNumeros();
		System.out.println("-------------------------");
		System.out.println(obj.getMaximo());
		System.out.println("-------------------------");
		System.out.println(obj.getMinimo());
	}

}

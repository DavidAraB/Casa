package Tema6;

public class Ejer01 {

	public static float verMedia (int [] numeros) {
		float media=0;
		int suma=0;
		for(int i=0;i<20;++i) {
			++suma;
			media+= numeros[i];
		}
		media=media/suma;
		return media;
	}
	public static void verMayor(int [] numeros) {
		float media=verMedia(numeros);
		int mayor=0,menor=0,igual=0;
		for(int i=0;i<20;++i) {
			if(numeros[i]<media) ++menor;
			else if(numeros[i]>media) ++mayor;
			else ++igual;
		}
		System.out.println(mayor+" "+igual+" "+menor);
	}
	public static void verNum(int [] numeros) {
		for(int i=0;i<20;++i) {
			System.out.println( numeros [i]);
		}
	}
	
	public static void main(String[] args) {
		int [] numeros = new int [20];
		for(int i=0;i<20;++i) {
			numeros [i]= (int)(Math.random()*20)+1;
		}
		verNum(numeros);
		System.out.println("La media es: " + verMedia(numeros));;
		verMayor(numeros);
	}

	
}

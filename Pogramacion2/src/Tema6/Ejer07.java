package Tema6;

import java.util.Arrays;

public class Ejer07 {	
	
	int [] conjunto = new int[100];
	private int cont=0;
	public Ejer07() {}
	
	public void vaciarDatos() {
		//for(int i=0; i<cont;i++) {
		//	conjunto[i]=0;
		//7}
		Arrays.fill(conjunto, 0);
	}
	
	public boolean esMiembro(int num) {
		boolean miembro=false;
		for(int i=0; cont<conjunto.length && miembro==false; ++i) {
			if(num == conjunto[i]) miembro=true;
		}
		return miembro;
	}
	
	//public void agregar(int num) {
		//boolean miembro=false;
		//for(int i=0; i<cont && miembro==false; ++i) {
			//if(num == conjunto[i]) { miembro=true;}
		///}
			//if(miembro=false) {
			//	conjunto[cont]=num;
				//++cont;
				//}else System.out.println("El numero ya esta en el conjunto");
	//} 
	public void agregar(int n) {
		boolean valido=true;
		for(int i = 0 ; i<cont && valido == true;++i) {
			if(conjunto[i]==n)valido= false;
		}
		if(valido==true) {
			conjunto[cont]=n;
			++cont;
		}
		else System.out.println("Este numero ya pertenece al conjunto");
		
	}
	public void copiar(int [] conjunto2) {
		for(int i=0; i<=cont;++i) {
			conjunto2[i]=conjunto[i];
		}
	}
	public int posicion(int num) {
		int posicion=0;
		boolean miembro=false;
		for(int i=0; cont<conjunto.length && miembro==false; ++i) {
			if(num == conjunto[i]) {
				miembro=true;
				posicion=i;}
		}
		return posicion;
		}
	public void imprimir() {
	for(int i = 0;i<conjunto.length;++i) {
		if(i%10==0)System.out.println();
		System.out.print(conjunto[i]+" ");
	}
	System.out.println();
}
	}
	

	
	


package EjsRepasoEv2;

import java.util.Scanner;

public class Ejer04 {

	static int [] mesa = new int[10];
	static int clientes;
	
	public static  void darMesa(int clientes) {
		
		if(clientes>0 &&clientes<=4) {
			for(int i=0;i<mesa.length;i++) {
				if(mesa[i]==0) {
					mesa[i]=clientes;
					System.out.println("Tu mesa es la mumero"+(i+1));
					break;
				}
			}
		}else System.out.println("Lo siento, no aceptamos mesas de "+clientes);
	}
	/**
	 * 
	 * @param num simboliza el numero de la mesa
	 */
	public static void liberarMesa(int num) {
		if(mesa[num]!=0) {
			mesa[num]=0;
		}else System.out.println("Esa mesa ya estaba libre");
	}
	
	public static void estadoMesa() {
		for(int i=0;i<mesa.length;i++) {
				System.out.println("La mesa mumero "+(i+1)+" tiene: "+mesa[i]+" comensales");
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Convertido todo a static para ahorrarnos el objeto
		//Ejer04 rest = new Ejer04();
		int opcion;
		 do{
			System.out.println("Que opcion quieres:");
			opcion=teclado.nextInt();
			switch(opcion) {
			case 0: break;
			case 1:{
				darMesa(4);
				estadoMesa();
				break;}
			case 2:  {
				liberarMesa(3);
				estadoMesa();
				break;}
			}
		}while(opcion!=0);

	}
}

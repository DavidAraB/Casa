package Tema11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) throws FileNotFoundException {
		String fichero,palabra;
		Scanner tec = new Scanner(System.in);
		Scanner read = null;
		System.out.println("Dime el nombre del fichero");
		fichero=tec.nextLine();
		System.out.println("Dime la palabra");
		palabra=tec.nextLine();
		try {
			read= new Scanner(new BufferedReader(new FileReader(fichero)));
			int cont=0;
			while(read.hasNext()) {
				if(read.next().equalsIgnoreCase(palabra))++cont;
			}
			System.out.println("La palabra: "+palabra+" aparece: "+ cont+" veces");
		}finally {
			tec.close();
			if(read!=null)
				read.close();
		}
	}

}

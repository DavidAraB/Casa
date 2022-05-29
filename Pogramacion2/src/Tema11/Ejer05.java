package Tema11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) throws FileNotFoundException {
		String fichero="";
		Scanner tec = new Scanner(System.in);
		boolean java = false;
		String aux;
		do {
			System.out.println("que fichero quieres quitar comentarios");
			fichero=tec.next();
			if(fichero.endsWith(".java")) java=true;
		}while(java==false);
		Scanner read = null;
		PrintStream write = null;
		try {
			read= new Scanner(new BufferedReader(new FileReader(fichero)));
			write = new PrintStream(new FileOutputStream(fichero.substring(0,fichero.indexOf(".java"))+"v2.java"));

			while(read.hasNext()) {
				aux=read.nextLine();
				if(!aux.contains("//")&&!aux.contains("/**")&&!aux.contains("*")&&!aux.contains("*/"))write.println(aux);
			}
		}finally {
			//tec.close();
			//read.close();
			//write.close();
		}
	}

}

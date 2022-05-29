package Tema11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> palab= new ArrayList<String>();
		String fichero="C:/Users/david/Desktop/DAM/Programacion/Ejer04";
		File f;
		//System.out.println("Dime el nombre del fichero que quieres ordenar");
		//Scanner tec = new Scanner(System.in);
		//fichero=tec.nextLine();
		Scanner read= null;
		PrintStream write = null;
		try {
			f=new File(fichero);
			read = new Scanner(new BufferedReader(new FileReader(f)));
			if(read.hasNext()) {
				write = new PrintStream(new FileOutputStream(fichero.substring(0, fichero.indexOf(".txt"+"_sort")),false));
				while(read.hasNext()) {
					palab.add(read.next());
				}
				Collections.sort(palab);
				for(String x:palab) {
					write.println(x);
				}
			}
		}finally {
			if(write!=null)
				write.close();
			if(read!=null)
			read.close();
		//	if(tec!=null)
		//	tec.close();
		}
	}

}

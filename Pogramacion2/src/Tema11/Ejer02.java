package Tema11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejer02 {

	public static void main(String[] args) throws IOException {
		File f;
		String salida="";
		FileInputStream in = null;
		try {
			f = new File("Ejer01.txt");
			in= new FileInputStream(f);
			int c;
			while((c=in.read())!=-1) {
				salida+=(int)c+'\n';
			}
		}finally {
			if(in!=null) {
				in.close();
			}
		}
		System.out.println(salida);
	}

}

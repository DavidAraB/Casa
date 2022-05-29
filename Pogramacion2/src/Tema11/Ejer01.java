package Tema11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Ejer01 {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> tacha = new ArrayList<Integer>();
		//Mete los 500 numeros al array
		for(int i=2;i<=500;++i) {
			nums.add(i);
		}

		for(Integer x:nums) {
			if(tacha.add(x)==true) {
				tacha.remove(x);
			}
			for(Integer y:nums) {
				if(tacha.add(y)) {
					if(x==y)tacha.remove(y);
					else if(y%x==0)tacha.add(y);
					else tacha.remove(y);
				}
				if(x*x>=500)break;
			}
		}
		
		File archivo;
		try {
			archivo= new  File("Ejer01.txt");
			PrintStream out = new PrintStream(archivo);
			nums.removeAll(tacha);
			for(Integer x:nums) {
				out.println(x);
			}
			out.close();
		}finally {
			//out.close();
		}
		
		
	}


}


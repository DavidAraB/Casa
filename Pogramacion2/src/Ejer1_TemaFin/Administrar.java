package Ejer1_TemaFin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrar {

	ArrayList<Vehiculo> coches = new ArrayList<Vehiculo>();
	Scanner in=null;
	PrintStream out=null;

	String fichero,ftemp="temp.txt";
	boolean abre=true;

	public Administrar (String fichero){
		this.fichero=fichero;
		if(abrirFichero())System.out.println("todo bien");
		for(Vehiculo x : coches) {
			System.out.println(x);
		}
	}

	public boolean abrirFichero() {
		try {
			in = new Scanner(new BufferedReader(new FileReader(fichero)));
		}catch(FileNotFoundException e) {
			abre=false;
		}
		if(abre==true) {
			while(in.hasNextLine()) {
				if(!coches.add(new Vehiculo(in.nextLine())))System.out.println("no se mete");
			}
		}else System.out.println("No Se ha encontrado el archivo");
		return abre;
	}

	public void añadeVehiculo(String matricula, String marca, String modelo, String propietario, String año) {
		coches.add(new Vehiculo(matricula,marca,modelo,propietario,año));
	}

	public void añadeSancion(String matricula,String fecha, String motivo, String importe) {
		for(Vehiculo x: coches) {
			if(matricula.equals(x.matricula)) {
				x.multas.add(new Sancion(fecha,motivo,importe));
			}
		}
	}

	public void eliminaVehiculo(String matricula) {
		for(Vehiculo x:coches) {
			if(matricula.equals(x.matricula)&& x.multas.isEmpty()) {
				coches.remove(x);
			}else  if(matricula.equals(x.matricula)&& !!x.multas.isEmpty()) {
				System.out.println(x.multas.size());
			}else System.out.println("No hay coches con esa matricula");
		}
	}

	public void consultaSancion(String matricula) {
		for(Vehiculo x:coches) {
			if(matricula.equals(x.matricula)) {
				if(!x.multas.isEmpty()) {
					for(Sancion y: x.multas) {
						System.out.println(y.fecha+" "+y.importe+" "+y.motivo);
					}
				}else System.out.println("No tiene multas");
			}else System.out.println("No existe coche con es matricula");
		}

	}
	
	public void eliminaSancion(String matricula) {
		for(Vehiculo x:coches) {
			if(matricula.equals(x.matricula)) {
				if(!x.multas.isEmpty()) {
					//x.multas.removeAll(x.multas);
					x.multas.clear();
				}else System.out.println("No tenia multas");
			}else System.out.println("No existen coches con esa matricula");
		}
	}
	
	public int multasMayores(int cantidad,String año) {
		for(Vehiculo x : coches) {
			if(x.multas.size()>=cantidad) {
				System.out.println(x);
				
			}
			return x.añoToString(x.año);
		}
	}

	/**
	 * Cierra todos los ficheros abiertos y crea el fichero en caso de que no exista
	 */
	public void commit() {
		if(in!=null)
			in.close();
		if(out!=null)
			out.close();
		
		try {
			out = new PrintStream(new FileOutputStream(fichero,false));
		} catch (FileNotFoundException e) {}
		
		for(Vehiculo x : coches) {
			out.println(x);
		}
		out.close();
	}
}


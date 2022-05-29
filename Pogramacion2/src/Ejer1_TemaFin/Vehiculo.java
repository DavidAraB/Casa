package Ejer1_TemaFin;

import java.util.ArrayList;

public class Vehiculo {

	ArrayList<Sancion> multas = new ArrayList<Sancion>();
	String matricula, marca, modelo, propietario,año;
	int año1;
	public Vehiculo(String matricula, String marca, String modelo,
			String propietario, String año){
		
		this.matricula=matricula.toUpperCase();
		this.marca=marca;
		this.modelo=modelo;
		this.propietario=propietario;
		this.año=año;
	}
	
public Vehiculo(String entrada) {
		
		leeFichero(entrada);
	}

public void leeFichero(String entrada) {
	
	matricula=entrada.substring(0,entrada.indexOf(":"));
	entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
	marca=entrada.substring(0,entrada.indexOf(":"));
	entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
	modelo=entrada.substring(0,entrada.indexOf(":"));
	entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
	propietario=entrada.substring(0,entrada.indexOf(":"));
	entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
	año=entrada.substring(0,entrada.indexOf(":"));
	entrada=entrada.substring(entrada.indexOf(":"),entrada.length());
	if(entrada.indexOf(";")>=0) {
		while(entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>0) {
		multas.add(new Sancion(entrada.substring(0,entrada.indexOf(";")+1)));
		entrada=entrada.substring(entrada.indexOf(";")+1,entrada.length());
		}
	}
}
	
	public void añadirSancion(String fecha,String motivo,String importe) {
		multas.add(new Sancion(fecha,motivo,importe));
	}
	
public static boolean valida(String matricula) {
		
		if(matricula.length()>=7) {		
		matricula=matricula.toUpperCase();
		for(int i=0;i<matricula.length();++i) {
			if(i>3 && matricula.charAt(i)<'A'|| matricula.charAt(i)>'Z'||
					matricula.charAt(i)=='Ñ'|| matricula.charAt(i)=='Q')return false;
			if(i<=3 && matricula.charAt(i)<'0'|| matricula.charAt(i)>'9')return false;
		}
		return true;
		}else return false;
	}
public int añoToString(String año) {
	año1=Integer.parseInt(año);
	return año1;
}
}

package Ejer02TemaFin;

import java.io.Serializable;

public class Ventas implements Serializable{


	String fecha,cliente;
	float importe;
	boolean cobrada;
	
	public Ventas(String Fecha, float importe, String Cliente/*,String cobrada*/) {
		
		this.fecha=Fecha; 
		this.importe=importe;
		this.cliente=Cliente;
		//this.cobrada=cobrada;
		
	}
	/**
	 * Divide la linea en las variables siguiendo el formato  datosvehiculo.fecha|importe|cobrada;
	 * @param entrada .
	 */
	/*public Ventas(String entrada) {
		fecha = entrada.substring(entrada.indexOf('.')+1,entrada.indexOf('|'));
		entrada = entrada.substring(entrada.indexOf('|')+1,entrada.length());
		importe = entrada.substring(entrada.indexOf('.')+1,entrada.indexOf('|'));
		cobrada = entrada.substring(entrada.indexOf('|')+1,entrada.indexOf(';'));
	}*/
	
	/*public String toString() {
		String salida= '.'+fecha+'|'+importe+'|'+cobrada+'.';
		return salida;
	}*/
}

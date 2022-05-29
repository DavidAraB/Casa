package Ejer02TemaFin;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * los datos de los viajantes seran leidos de un fichero, su formato de separacion sera mediante espacios
 * @author david
 *
 */
public class Viajante implements Serializable{

	

	ArrayList<Ventas> ventas = new ArrayList<Ventas>();
	ArrayList<Ventas> ventasHistoricas = new ArrayList<Ventas>();
	
	String DNI, nombre;
	int ventasHechas,distancia,antiguedad,importeAc;
	boolean cobrada;
	
	public Viajante(String DNI,String nombre,int antiguedad,int ventasHechas,int distancia) {
		this.DNI=DNI;
		this.nombre=nombre;
		this.antiguedad=antiguedad;
		this.ventasHechas=ventasHechas;
		this.distancia=distancia;
	}
	
	/*public Viajante(String entrada) {
		leerFichero(entrada);
	}*/
	
	
	public void añadirVenta(String Fecha, float importe, String Cliente) {
		ventas.add(new Ventas(Fecha,importe,Cliente));
	}
	
	public boolean cobrarVenta(String Fecha, float importe, String Cliente) {
		boolean cobrada=false;
		for(Ventas x:ventas) {
			if(Fecha.equals(x.fecha) && importe==x.importe && Cliente.equals(x.cliente)) {
				x.cobrada=true;
				cobrada=true;
				importeAc+=importe;
			}
		}
		return cobrada;
	}
	
	public void porCobrar() {
		ArrayList<Ventas> pendiente = new ArrayList<Ventas>();
		for(Ventas x:ventas) {
			if(x.cobrada==false) {
				pendiente.add(x);
			}
		}
		for(Ventas x: pendiente) {
			System.out.println("Cliente: "+x.cliente+" Fecha: "+x.fecha+" Importe:"+x.importe);
		}
	}
	
	
		
		
		
		
		
		
		
		
		
	/*private void leerFichero(String entrada) {
		DNI=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		nombre=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		antiguedad=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		ventasHechas=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		distancia=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":"),entrada.length());
		if(entrada.indexOf(";")>=0) {
			while(entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>0) {
			ventas.add(new Ventas(entrada.substring(0,entrada.indexOf(";")+1)));
			entrada=entrada.substring(entrada.indexOf(";")+1,entrada.length());
			}
		}
	}*/
	
	
	
	
}

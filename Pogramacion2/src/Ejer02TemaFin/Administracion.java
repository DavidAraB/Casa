package Ejer02TemaFin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Administracion {

	ArrayList<Viajante> viajantes = new ArrayList<Viajante>();

	String fichero;

	public Administracion(String fichero) {
		this.fichero=fichero;
		if(leeFichero(fichero)) {
			for(Viajante x: viajantes){
				System.out.println(x.nombre);
			}
		}
	}

	public boolean leeFichero(String fichero) {
		try {
			return viajantes.addAll(Archivo.leer(fichero));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void escribeFichero(String fichero, ArrayList<Viajante> viajantes) {
		
		try {
			Archivo.escribir(fichero, viajantes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean incrementaDistancia(String DNI,int distancia) {
		boolean incrementada=false;
		for(Viajante x:viajantes) {
			if(DNI.equals(x.DNI)) {
				x.distancia+=distancia;
				incrementada=true;
			}
		}return incrementada;
	}

	/**
	 * 
	 * @param DNI Se pide el DNI ya que debe ser unico para cada empleado
	 * @return
	 */
	public boolean existeViajante(String DNI) {
		boolean existe=false;
		for(Viajante x: viajantes) {
			if(DNI.equals(x.DNI)) {
				existe=true;
				return true;
			}
		}
		return existe;
	}
	
	public boolean añadeViajante(String DNI,String nombre,int antiguedad,int ventasHechas,int distancia) {
		if(!existeViajante(DNI)) {
			viajantes.add(new Viajante(DNI,nombre,antiguedad,ventasHechas,distancia));
			return true;
		}else return false;
	}
	
	public boolean borraViajante(String DNI) {
		boolean borrado =false;
		if(existeViajante(DNI)) {	
			Iterator<Viajante> it = viajantes.iterator();
			while(it.hasNext() && borrado==false) {
				Viajante x = it.next();
				if(DNI.equals(x.DNI)) {
					viajantes.remove(x);
					borrado=true;
				}
			}
		}	return borrado;
	}
	
	public void listado() {
		String salida="";
		float cantidad=0;
		for(Viajante x: viajantes) {
			
			salida+="DNI: "+x.DNI+" Distancia: "+x.distancia+" Importe Acumulado: "+x.importeAc+"\r";
		}
		System.out.println(salida);
	}
	
	public void inicializaVentas() {
		for(Viajante x:viajantes) {
			x.ventas.clear();
			x.distancia=0;
		}
	}
	
	public boolean añadeVenta(String DNI,	String fecha,String cliente,float importe) {
		boolean añadida=false;
		if(existeViajante(DNI)) {
			for(Viajante x:viajantes) {
				if(DNI.equals(x.DNI)) {
					x.añadirVenta(fecha, importe, cliente);	
					añadida=true;
				}
			}
		}return añadida;
	}
	
	public boolean cobraVenta(String DNI,String Fecha, float importe, String Cliente) {
		boolean cobrada=false;
		if(existeViajante(DNI)) {
			for(Viajante x:viajantes) {
				if(DNI.equals(x.DNI)) {
					x.cobrarVenta(Fecha, importe, Cliente);
					cobrada=true;
				}
			}
		}
		return cobrada;
	}
	
	public void listaPorCobrar(String DNI) {
		if(existeViajante(DNI)) {
			for(Viajante x:viajantes) {
				if(DNI.equals(x.DNI)) {
					x.porCobrar();	
				}
			}
		}
	}
}
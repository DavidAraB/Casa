import java.io.Serializable;

public class Mujer extends Contacto implements Serializable{

	int hijos;
	
	public Mujer(String nombre, String apellidos, int hijos) {
		super(nombre, apellidos);
		this.hijos=hijos;
	}
	
	public String toString() {
		String salida="";
		salida+= "Nombre: "+super.nombre+" Apellidos: "+super.apellidos+" Numero de hijos: "+hijos;
		return salida;
		
	}

}

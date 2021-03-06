import java.io.Serializable;
import java.util.ArrayList;

public class Contacto implements Serializable{//,Comparable<Contacto> {

	String nombre, apellidos;
	ArrayList<Numero> numeros = new ArrayList<Numero>();
	
	public Contacto(String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public void aņadirNumero(String telefono, String tipotelefono) {
		if(!existeNumero(telefono))numeros.add(new Numero(telefono,tipotelefono));
	}

	public boolean existeNumero(String numero) {

		for(Numero y:numeros) {
			if(y.telefono.equals(numero)) {
				return true;
			}
		}return false;

	}


	public int compareTo(Contacto o) {
		return nombre.compareTo(o.nombre);
	}
}

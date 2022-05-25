import java.io.Serializable;

public class Hombre extends Contacto implements Serializable{

	boolean barba;
	public Hombre(String nombre, String apellidos, boolean barba) {
		super(nombre, apellidos);
		this.barba=barba;
	}
	
	public String toString() {
		String salida="";
		salida+= "Nombre: "+super.nombre+" Apellidos: "+super.apellidos;
		if(barba==true) {
			salida+=" con barba";
		}else salida+=" sin barba";
		return salida;
		
	}

}

package EjsRepasoEv2.Ejer08;

public class Publicacion {
	
	String ISBN;
	String titulo;
	int año;
	
	public Publicacion() {};
	public Publicacion(String ISBN, String titulo, int año) {
		this.año=año;
		this.ISBN=ISBN;
		this.titulo=titulo;
	}
	//String ISBN, String titulo, int año
@Override
	public String toString() {

		return "El titulo de la publicacion es: "+titulo+" Su ISBN es: "+ISBN+" Su año de publicacion es: "+
		año;
		
	}
}

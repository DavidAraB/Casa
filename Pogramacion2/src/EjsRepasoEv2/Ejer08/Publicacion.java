package EjsRepasoEv2.Ejer08;

public class Publicacion {
	
	String ISBN;
	String titulo;
	int a�o;
	
	public Publicacion() {};
	public Publicacion(String ISBN, String titulo, int a�o) {
		this.a�o=a�o;
		this.ISBN=ISBN;
		this.titulo=titulo;
	}
	//String ISBN, String titulo, int a�o
@Override
	public String toString() {

		return "El titulo de la publicacion es: "+titulo+" Su ISBN es: "+ISBN+" Su a�o de publicacion es: "+
		a�o;
		
	}
}

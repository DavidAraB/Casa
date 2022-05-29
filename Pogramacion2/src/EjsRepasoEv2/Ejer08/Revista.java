package EjsRepasoEv2.Ejer08;

public class Revista extends Publicacion{
	int numero;
	public Revista() {}
	public Revista(String ISBN, String titulo, int año, int numero) {
		super(ISBN,titulo,año);
		this.numero=numero;
	}
	//String ISBN, String titulo, int año, int numero
	@Override
	public String toString() {
		
		return super.toString()+ "y su numero asociado es:"+numero;
		
	}
}

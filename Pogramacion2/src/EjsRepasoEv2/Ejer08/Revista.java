package EjsRepasoEv2.Ejer08;

public class Revista extends Publicacion{
	int numero;
	public Revista() {}
	public Revista(String ISBN, String titulo, int a�o, int numero) {
		super(ISBN,titulo,a�o);
		this.numero=numero;
	}
	//String ISBN, String titulo, int a�o, int numero
	@Override
	public String toString() {
		
		return super.toString()+ "y su numero asociado es:"+numero;
		
	}
}

package EjsRepasoEv2.Ejer08;

public class Libro extends Publicacion implements Prestable{

	boolean prestado=false;
	public Libro() {}
	public Libro(String ISBN, String titulo, int año ) {
		super(ISBN,titulo,año);
		prestado=false;
	}
	
	@Override
	public void presta() {
		if(!estaPrestado()) {
			prestado=true;
			System.out.println("Se ha prestado el libro: "+titulo);
		}else System.out.println("El libro ya estaba prestado");
		
	}

	@Override
	public void devuelve(){
		if(estaPrestado()) {
			System.out.println("Se ha devuelto el libro");
		}else System.out.println("El libro no estaba prestado");
		
	}

	@Override
	public boolean estaPrestado() {
		if(prestado==false) {
			return false;
		}
		return prestado;
	}
//String ISBN, String titulo, int año, int numero
	public String toString() {
		String prestado="";
		if(estaPrestado()) {
			prestado="el libro esta prestado";
		}else prestado="el libro no esta prestado";
		return super.toString()+" y "+prestado;
		
	}
}

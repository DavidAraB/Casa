package EjsRepasoEv2.Ejer08;

public class Conductor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Revista rev=new Revista("ISBN","revista1",1990,1);
		Libro libro=new Libro("ISBN","libro1",1990);
		
		System.out.println(rev.toString());
		System.out.println(libro.toString());;
		System.out.println(libro.estaPrestado());
		libro.presta();
		System.out.println(libro.estaPrestado());
		libro.devuelve();
		
	}

}

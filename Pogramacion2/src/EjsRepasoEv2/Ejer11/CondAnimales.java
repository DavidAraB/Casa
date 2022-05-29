package EjsRepasoEv2.Ejer11;

public class CondAnimales {

	public static void main(String[] args) {
		
		Animal [] animales= new Animal[100];
		animales[0]=new Perro("salxixa","lata");
		animales[1]=new Perro("salxixa","seca");
		animales[2]=new Gato(true);
		animales[3]=new Gato(false);
		animales[4]=new Pez("dulce");
		animales[5]=new Pez("salada");
		
		for(int i=0; i<=5;i++) {
			System.out.println( animales[i].verPrecio() );
		}
	}

}

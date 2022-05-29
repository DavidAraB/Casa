package EjsRepasoEv2.Ejer11;

public class Gato extends Animal {
	
	boolean garras;
	
	public Gato(boolean garras) {
		super();
		this.garras=garras;
		
	}
	public float verPrecio() {
		if(garras==true) {
			super.precio+=(super.precio*0.1);
		}else super.precio-=(super.precio*0.05);
		return super.precio;
	}
}

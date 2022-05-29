package EjsRepasoEv2.Ejer11;

public class Pez extends Animal {
	
	String agua;
	
	public Pez(String agua) {
		super();
		this.agua=agua;
		
	}
	public float verPrecio() {
		if(agua.equals("dulce")) {
			super.precio+=(super.precio*0.2);
		}
		return super.precio;
	}
}


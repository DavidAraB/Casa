package EjsRepasoEv2.Ejer11;

public class Perro extends Animal {
	
	private String raza="";
	private String comida="";
	
	public Perro(String raza, String comida) {
		super();
		this.raza=raza;
		this.comida=comida;
		
	}
	public float verPrecio() {
		if(comida.equals("lata")) {
			super.precio+=(super.precio*0.1);
		}
		return super.precio;
	}
}

package EjsRepasoEv2;

public class Espadas extends Carta {

	private String palo="Espadas";
	
	public Espadas(int valor) {
		super(valor);
		palo="Espadas";
	}

	public String toString() {
		return super.toString()+"de "+palo;
	}
}

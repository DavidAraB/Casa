package EjsRepasoEv2;

public class Oros extends Carta{

	private String palo="Oros";
	public Oros(int valor) {
		super(valor);
		palo="Oros";
	}

	public String toString() {
		return super.toString()+"de "+palo;
	}
}

package EjsRepasoEv2;

public class Copas extends Carta{

	private String palo="copas";
	public Copas(int valor) {
		super(valor);
		palo="copas";
	}

	public String toString() {
		return super.toString()+"de "+palo;
	}
}

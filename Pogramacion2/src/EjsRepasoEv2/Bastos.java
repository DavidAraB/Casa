package EjsRepasoEv2;

public class Bastos extends Carta{

	private String palo="Bastos";
	
	public Bastos(int valor) {
		super(valor);
		palo="Bastos";
	}

	public String toString() {
		return super.toString()+"de "+palo;
	}
}

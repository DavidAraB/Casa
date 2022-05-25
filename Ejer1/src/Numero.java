import java.io.Serializable;

public class Numero implements Serializable{

	String telefono, tipo;
	
	public Numero(String numero, String tipo) {
		this.telefono=numero;
		this.tipo=tipo;
	}
	
	public static boolean validaNumero(String telefono) {
		boolean valido=true;
		for(int i=0; i<telefono.length();i++) {
			if(telefono.charAt(i)<'0' || telefono.charAt(i)>'9' && telefono.charAt(i)!='+' && telefono.charAt(i)!=' ') valido=false;
		}
		return valido;
	}
}

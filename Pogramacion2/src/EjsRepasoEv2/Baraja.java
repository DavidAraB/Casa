package EjsRepasoEv2;

public class Baraja {

	Carta[] baraja=new Carta[40];
	public void crearBaraja() {
		/*Me ha dado un plao ioncreible acabarlo pero falta ajustar los valores
		 * de los ifs para que se creen las cartas, orta opcion seria crear un meteodo para que añada cada palo por separado
		 */
		for(int i=0; i<40; i++) {
			if(i<10) {
				if(i<7)baraja[i]=new Oros(i+1);
				else baraja[i]=new Oros(i+4);
			}else if(i>=10 && i<19) {
				if(i<16)baraja[i]=new Copas(i+1);
				else baraja[i]=new Copas(i+4);
			}else if(i>=19 && i<28) {
				if(i<16)baraja[i]=new Espadas(i+1);
				else baraja[i]=new Espadas(i+4);
			}else {
				if(i<16)baraja[i]=new Bastos(i+1);
				else baraja[i]=new Bastos(i+4);
			}
			
		}
		
		
	}
	/*public int valorCarta() {
		int valor=1;
		
		return valor;
	}*/
	
	public static void main(String[] args) {
		
	}
}

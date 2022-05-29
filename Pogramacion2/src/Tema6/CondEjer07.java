package Tema6;

public class CondEjer07 {

	public static void main(String[] args) {
	Ejer07 conjunto = new Ejer07();
	Ejer07 conjunto2 = new Ejer07();
	for(int i=0;i<99;++i) {
		conjunto.agregar(i);
	}
		conjunto.imprimir();
		conjunto.copiar(conjunto2.conjunto);
		conjunto2.imprimir();
		conjunto.vaciarDatos();
		conjunto.imprimir();
	}

}

package Tema52;

public class CuentaCorriente {
	private String titular;
	private float saldo, dinero;
	private String codigo;
private final String cadena="01123456789";
	boolean codigoval = true;
	
	//No me ha salido de los cojones validar 
	
	
	public CuentaCorriente(String titular, float saldo, String codigo) {
		//for(int i=0;i<codigo.length() && codigoval==true && i<9;++i) {
			//if(cadena.indexOf(codigo.charAt(i)>0)) {
			//	codigoval=true;
			//}else codigoval=false;
		//}
		//if(codigoval=true) {
		this.titular=titular;
		this.saldo=saldo;
		this.codigo=codigo;}
		//else System.out.println("Codigo erroneo");}
	
	public void sumSaldo(float saldo) {
		this.saldo+=saldo;
}
	public void retiraSaldo(float dinero){
		if(saldo>=dinero) this.saldo-=dinero;
		else System.out.println("No tienes suficiente dinero");
	}
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}

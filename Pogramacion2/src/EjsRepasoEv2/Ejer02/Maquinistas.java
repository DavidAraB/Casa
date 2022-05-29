package EjsRepasoEv2.Ejer02;

public class Maquinistas extends Empleados implements Pedirdatos{

	int maquina;
	int años;
	
	public Maquinistas() {
		pedirDatos();
	}
	
	public void pedirDatos() {
		System.out.println("maq");
		super.pedirDatos();
		System.out.println("Que maquina usa");
		maquina=tec.nextInt();
		System.out.println("Cuantos años lleva en el puesto");
		años=tec.nextInt();
	}
	
	public String verDatos() {
		return super.verDatos()+" usa la maquina"+maquina+" y la usa desde hace: "+años;
		
	}
}

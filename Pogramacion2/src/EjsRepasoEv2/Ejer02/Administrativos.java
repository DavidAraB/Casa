package EjsRepasoEv2.Ejer02;



public class Administrativos extends Empleados implements Pedirdatos{
	
	
	
	String estudios;
	int ordenador;
	
	public Administrativos() {
		pedirDatos();
	}
	
	public void pedirDatos() {
		System.out.println("adm");
		super.pedirDatos();
		System.out.println("Que ha estudiado el admin");
		estudios=tec.next();
		System.out.println("numero de ordenador");
		ordenador=tec.nextInt();
	}
	
	public String verDatos() {
		return super.verDatos()+" Ha estudiado: "+estudios+" y usa el ordenador numero "+ordenador;
		
	}
}

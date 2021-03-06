import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Agenda {

	String fichero;
	ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	ArrayList<Hombre> hombres = new ArrayList<Hombre>();
	ArrayList<Mujer> mujeres = new ArrayList<Mujer>();
	public Agenda(String fichero) {
		this.fichero=fichero;
		if(leeFichero(fichero)) {
			for(Contacto x: contactos){
				System.out.println(x.nombre);
			}
		}
		
	}
	
	public boolean leeFichero(String fichero) {
		try {
			return contactos.addAll(Fichero.leer(fichero));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void escribeFichero(String fichero, ArrayList<Contacto> contactos) {
		
		try {
			Fichero.escribir(fichero, contactos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean existeContacto(String nombre, String apellidos) {
		boolean existe;
		for(Contacto x:contactos) {
			if(x.nombre.equals(nombre) && x.apellidos.equals(apellidos)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * a?ade contactos
	 * @param nombre
	 * @param apellidos
	 * @return true si a?ade el contacto, false si ya existe
	 */
	public boolean a?adeContacto(String nombre, String apellidos) {
		boolean hecho=false;
		if(!existeContacto(nombre, apellidos)) {
			contactos.add(new Contacto(nombre,apellidos));
			hecho=true;
		}else System.out.println("Ya existe un contacto con ese nombre");
		return hecho;

	}

	/**
	 * borra contactos
	 * @param nombre
	 * @param apellidos
	 * @return true si ha borrado el contacto
	 */
	public boolean borrarContacto(String nombre, String apellidos) {
		
		boolean borrado=false;
		if(existeContacto(nombre,apellidos)) {
			Iterator<Contacto> it = contactos.iterator();
			
			while(it.hasNext() && borrado==false) {
				Contacto x = it.next();
				if(nombre.equals(x.nombre) && apellidos.equals(x.apellidos)) {
					contactos.remove(x);
					borrado=true;
					return borrado;
				}
			}
		}
		return borrado;
	}
	
	public void ordenaAlf() {

		//No lo hago con comparable porqe me da error, lo hago con un treeset		
		TreeSet<Contacto> ordenado = new TreeSet<Contacto>();
		for(Contacto x:contactos) {
			ordenado.add(x);
		}
		for(Contacto x: ordenado) {
			System.out.println(x.nombre+" "+x.apellidos);
		}

	}
	
	public String buscarNombre(String nombre, String apellidos) {
		String salida="";
		if(existeContacto(nombre,apellidos)) {
			for(Contacto x:contactos) {
				if((nombre.equals(x.nombre) && apellidos.equals(x.apellidos) && (!x.numeros.isEmpty()))) {
					for(Numero y: x.numeros) {
						salida+=y.telefono+" "+y.tipo+"\r";
					}
				}
			}return salida;
		}else return salida+="No existe contacto";
	}
	
	public boolean a?adirTelefono(String nombre,String apellidos, String telefono,String tipotelefono) {
		boolean a?adido=false;
		if(existeContacto(nombre, apellidos)) {
			if(Numero.validaNumero(telefono)) {
				for(Contacto x: contactos) {
					if(nombre.equals(x.nombre) && apellidos.equals(x.apellidos)) {
						x.numeros.add(new Numero(telefono, tipotelefono));
						a?adido=true;
					}
				}
			}
		}return a?adido;
	}
	
	
	public boolean borraNumero(String nombre, String apellidos, String telefono) {
		boolean borrado=false;
		if(existeContacto(nombre,apellidos)) {
			for(Contacto x: contactos) {
				if(!x.numeros.isEmpty()) {
					Iterator<Numero> it= x.numeros.iterator();
					while(it.hasNext() && borrado==false) {
						Numero y = it.next();
						if(y.telefono.equals(telefono)) {
							x.numeros.remove(y);
							borrado=true;
							
						}
					}
				}
			}
		}
		return borrado;
	}
	
	public void asignarSexo() {
		Random r = new Random();
		hombres.clear();
		mujeres.clear();
		for(Contacto x:contactos) {
			if(x instanceof Contacto) {
				if(r.nextInt(2)<1) {
					//a.hombres.clear();
					hombres.add(new Hombre(x.nombre,x.apellidos,r.nextBoolean()));
				}else {
					//a.mujeres.clear();
					mujeres.add(new Mujer(x.nombre,x.apellidos,r.nextInt(20)));
					
				}
			}
		}
	}	

	
	

	/**
	 * 
	 * @param telefono
	 * @return el nombre de la persona que tiene ese numero
	 */
	public void buscaTelefono(String telefono) {
		for(Contacto x:contactos) {
			for(Numero y:x.numeros) {
				if(y.telefono.equals(telefono))
					System.out.println("Nombre: "+x.nombre+" Apellidos: "+x.apellidos+"\r");
			}
		}
	}

	/*public void verInfo() {
		for(Hombre x: contactos) {
			
		}
	}*/

	

}

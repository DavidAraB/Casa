package Tema52;

import java.util.Scanner;

public class Trabajador {
	Scanner teclado = new Scanner(System.in);
	String nombre, estadoCivil,turno;
	int id,titulacion,añosEmp;
	
public Trabajador(String nombre, String estadoCivil, String turno, int id, int titulacion, int añosEmp) {
	this.nombre=nombre;
	this.estadoCivil=estadoCivil;
	this.turno=turno;
	this.id=id;
	this.titulacion=titulacion;
	this.añosEmp=añosEmp;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEstadoCivil() {
	return estadoCivil;
}
public void setEstadoCivil(String estadoCivil) {
	this.estadoCivil = estadoCivil;
}
public String getTurno() {
	return turno;
}
public void setTurno(String turno) {
	this.turno = turno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTitulacion() {
	return titulacion;
}
public void setTitulacion(int titulacion) {
	this.titulacion = titulacion;
}
public int getAñosEmp() {
	return añosEmp;
}
public void setAñosEmp(int añosEmp) {
	this.añosEmp = añosEmp;
}
public void modTrab() {
	int opcion;
	System.out.println("Dime el campo que deseas modificar, 0 para nombre,1 ec, 2 turno, 3 titulacion, 4 años emp");
	opcion=teclado.nextInt();
	switch(opcion) {
	case 0: setNombre(teclado.next());break;
	case 1: setEstadoCivil(teclado.next());break;
	case 2: setTurno(teclado.next());break;
	case 3: setTitulacion(teclado.nextInt());break;
	case 4: setAñosEmp(teclado.nextInt());break;
	}	
}public void verTrab() {
	System.out.println("Info trabajador:");
	System.out.println(getNombre()+getEstadoCivil()+getTurno()+getId()+getTitulacion()+
	getAñosEmp());
	
	
	
	
	
}
}
